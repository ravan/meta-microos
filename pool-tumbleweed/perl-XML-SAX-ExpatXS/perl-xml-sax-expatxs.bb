SUMMARY = "Perl SAX 2 XS extension to Expat parser"
DESCRIPTION = "XML::SAX::ExpatXS is a direct XS extension to Expat XML parser. It implements \
 Perl SAX 2.1 interface. See http://perl-xml.sourceforge.net/perl-sax/ for \
 Perl SAX API description. Any deviations from the Perl SAX 2.1 specification \
 are considered as bugs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.33"

RPM_NAME = "perl-XML-SAX-ExpatXS-1.33-5.16.aarch64.rpm"
RPM_HASH = "733f8ccc539e856f6586b7f78d36c6cc4e4e467b0d9f5b5a93f9dc8c09dbe9c734da3d7577f8acd9faf9addb0baeed98aeae86757cc51b74cf7bb9e2ed6cc7d0"

RPROVIDES:${PN} += "perl-XML--SAX--ExpatXS \
perl-XML--SAX--ExpatXS--ContentModel \
perl-XML--SAX--ExpatXS--Encinfo \
perl-XML--SAX--ExpatXS--Encoding \
perl-XML--SAX--ExpatXS--Preload \
perl-XML-SAX-ExpatXS"

RDEPENDS:${PN} += "/usr/bin/sh \
expat \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
perl--MODULE-COMPAT-5.44.0 \
perl-XML--SAX"

inherit rpm
