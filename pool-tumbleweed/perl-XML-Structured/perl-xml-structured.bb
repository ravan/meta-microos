SUMMARY = "Simple conversion API from XML to perl structures and back"
DESCRIPTION = "Provides a way to convert XML data into a predefined perl data structure and \
back to XML. Unlike with modules like XML::Simple, it is an error if the XML \
data does not match the provided skeleton (the 'DTD'). \
Another advantage is that the order of the attributes and elements is taken \
from the DTD when converting back to xml."
LICENSE = "Artistic-1.0"

PV = "1.3"

RPM_NAME = "perl-XML-Structured-1.3-1.38.aarch64.rpm"
RPM_HASH = "8920a10ae84f498c720a38a314fb7adcabdfb8e81ff50b1fed9573e5affb745a71dd678417663bfa94890444bd23a89cf43675da5f981142883ee9a45c503ef3"

RPROVIDES:${PN} += "perl-XML--Structured \
perl-XML--Structured--saxparser \
perl-XML--Structured--saxparser-pureperl \
perl-XML-Structured"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
