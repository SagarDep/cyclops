package cyclops.collections.adt;

import cyclops.companion.Monoids;
import cyclops.stream.ReactiveSeq;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;


public class ListTest {

    @Test
    public void testMap(){
        assertThat(Seq.of(1,2,3).map(i->1*2),equalTo(Seq.of(2,4,6)));
        assertThat(Seq.empty().map(i->1*2),equalTo(Seq.empty()));
    }
    @Test
    public void testFlatMap(){
        assertThat(Seq.of(1,2,3).flatMap(i-> Seq.of(1*2)),equalTo(Seq.of(2,4,6)));
        assertThat(Seq.empty().flatMap(i-> Seq.of(1*2)),equalTo(Seq.empty()));
    }

    @Test
    public void foldRight(){
        Seq.fromStream(ReactiveSeq.range(0,100_000)).foldRight(Monoids.intSum);
    }
}