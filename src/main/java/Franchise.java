import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Franchise {
    private String franchiseName;
    private Publisher publisherName;

    public Franchise(Publisher publisherName){
        this.publisherName = publisherName;
    }

}
