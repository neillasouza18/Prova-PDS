package q3;

public interface Xmlreader {
  void set_content_handler(content_handler handler);
  void parse(InputStream is);
}