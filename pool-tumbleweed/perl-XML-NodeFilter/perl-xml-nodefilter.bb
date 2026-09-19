SUMMARY = "XML::NodeFilter"
DESCRIPTION = "XML::NodeFilter is a generic node filter class for DOM traversal as \
specified in the DOM Level 2 Traversal and Range specification. It \
extends that specification, so this class is easier to use for Perl \
programmers."
LICENSE = "Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-XML-NodeFilter-0.01-194.46.aarch64.rpm"
RPM_HASH = "b351d0e91835a5065b1a036a308458c9c95bcd58cb26705145cef9db4c6ed3e3d5820c577aa985cefce0f644379565a638eea0ac726eadc7b85d3ea2a63b5c69"

RPROVIDES:${PN} += "perl-XML--NodeFilter \
perl-XML-NodeFilter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
