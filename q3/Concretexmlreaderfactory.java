package q3;

public class Concretexmlreaderfactory extends Xmlreaderfactory {
  @Override
  public Xmlreader create_xml_reader() {
    return new Specificxmlreader();
  }
}
