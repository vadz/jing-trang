package com.thaiopensource.relaxng.output.xsd.basic;

import java.util.List;
import java.util.Collections;

public class ParticleSequence extends Particle {
  private final List children;

  public ParticleSequence(List children) {
    this.children = Collections.unmodifiableList(children);
  }

  public List getChildren() {
    return children;
  }

  public Object accept(ParticleVisitor visitor) {
    return visitor.visitSequence(this);
  }
}
