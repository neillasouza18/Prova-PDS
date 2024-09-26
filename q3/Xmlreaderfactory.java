package q3;

public abstract class Xmlreaderfactory {
  public abstract Xmlreader create_xml_reader();

  public Xmlreader get_instance() {
    Xmlreader reader = create_xml_reader();
    // Qualquer configuração adicional ou inicialização pode ser feita aqui
    return reader;
  }
}
