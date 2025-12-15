import java.net.URI;
public class ResolvingRelativeURI{
    public static void main(String[] args) throws Exception {
        URI uri=URI.create("https://ui.shadcn.com");
        URI relativeUri=URI.create("/docs/components/form");
        URI res=uri.resolve(relativeUri);
        System.out.println("relative URI:"+res);
    }
}