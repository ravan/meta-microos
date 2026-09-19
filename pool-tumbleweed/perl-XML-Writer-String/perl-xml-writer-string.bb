SUMMARY = "Capture output from XML::Writer"
DESCRIPTION = "This module implements a bare-bones class specifically for the purpose of \
capturing data from the XML::Writer module. XML::Writer expects an \
IO::Handle object and writes XML data to the specified object (or STDOUT) \
via it's print() method. This module simulates such an object for the \
specific purpose of providing the required print() method. \
 \
It is recommended that $writer->end() is called prior to calling \
$s->value() to check for well-formedness."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.100.0"

RPM_NAME = "perl-XML-Writer-String-0.100.0-1.9.noarch.rpm"
RPM_HASH = "a17483392348b1ccab6a10bbd05052255e134ef497eb054bb1820bfddfc3ab71f707382545c937382b5c586a601237c4bf1bee2d3b0892af143ac622fd704b30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Writer--String \
perl-XML-Writer-String"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-XML--Writer"

inherit rpm
