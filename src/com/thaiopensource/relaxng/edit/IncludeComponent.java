package com.thaiopensource.relaxng.edit;

import java.util.List;
import java.util.Vector;

public class IncludeComponent extends Component implements Container {
  private String href;
  private String ns;
  private String baseUri;
  private final List components = new Vector();

  public IncludeComponent(String href) {
    this.href = href;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public List getComponents() {
    return components;
  }

  public String getNs() {
    return ns;
  }

  public void setNs(String ns) {
    this.ns = ns;
  }

  public String getBaseUri() {
    return baseUri;
  }

  public void setBaseUri(String baseUri) {
    this.baseUri = baseUri;
  }
}
