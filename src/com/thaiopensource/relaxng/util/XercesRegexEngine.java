package com.thaiopensource.relaxng.util;

import com.thaiopensource.datatype.xsd.RegexEngine;
import com.thaiopensource.datatype.xsd.Regex;
import com.thaiopensource.datatype.xsd.InvalidRegexException;

import org.apache.xerces.utils.regex.RegularExpression;
import org.apache.xerces.utils.regex.ParseException;

public class XercesRegexEngine implements RegexEngine {
  public Regex compile(String expr) throws InvalidRegexException {
    try {
      final RegularExpression re = new RegularExpression(expr, "X");
      return new Regex() {
	  public boolean matches(String str) {
	    return re.matches(str);
	  }
	};
    }
    catch (ParseException e) {
      throw new InvalidRegexException(e.getMessage(), e.getLocation());
    }
  }
}
