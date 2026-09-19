SUMMARY = "Perl extension for writing XML documents"
DESCRIPTION = "XML::Writer is a helper module for Perl programs that write an XML \
document. The module handles all escaping for attribute values and \
character data and constructs different types of markup, such as tags, \
comments, and processing instructions. \
 \
By default, the module performs several well-formedness checks to catch \
errors during output. This behaviour can be extremely useful during \
development and debugging, but it can be turned off for production-grade \
code. \
 \
The module can operate either in regular mode in or Namespace processing \
mode. In Namespace mode, the module will generate Namespace Declarations \
itself, and will perform additional checks on the output. \
 \
Additional support is available for a simplified data mode with no mixed \
content: newlines are automatically inserted around elements and elements \
can optionally be indented based as their nesting level."
LICENSE = "MIT"

PV = "0.900"

RPM_NAME = "perl-XML-Writer-0.900-1.28.noarch.rpm"
RPM_HASH = "489d6354be53d650efd54ad688d88849d5fd0aa3b75450507c8aa6df6aa40c9a7edeb12e392d05fbdbf506b02351a0ad70c6feec7f3fc1541b83707a2149a207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Writer \
perl-XML--Writer---PrintChecker \
perl-XML--Writer---String \
perl-XML--Writer--Namespaces \
perl-XML-Writer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
