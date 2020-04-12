package sample.api.facebook;

import lombok.Data;

import java.util.List;

@Data
public class Groups {
    private List<Group> data ;
    private Paging paging ;

    @Data
    private class Paging {

        private Cursors cursors;

        @Data
        private class Cursors {
            private String after ;
            private String before ;
        }
    }
}
