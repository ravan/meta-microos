SUMMARY = "Interface to GNOME libxslt library"
DESCRIPTION = "This module is an interface to the GNOME project's libxslt. This is an \
extremely good XSLT engine, highly compliant and also very fast. I have \
tests showing this to be more than twice as fast as Sablotron."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.003000"

RPM_NAME = "perl-XML-LibXSLT-2.003000-1.18.aarch64.rpm"
RPM_HASH = "37287205127a0f7c36604c8156b8886dead8c0e895e04f483af976c9c7a0aa5590426262532f733826ca02b4034ce897ea7e284624d8527f24a95c2e621576a0"

RPROVIDES:${PN} += "perl-XML--LibXSLT \
perl-XML--LibXSLT--Quick \
perl-XML--LibXSLT--Security \
perl-XML--LibXSLT--StylesheetWrapper \
perl-XML-LibXSLT"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libxml2.so.16 \
libxslt.so.1 \
perl--MODULE-COMPAT-5.44.0 \
perl-File--Path \
perl-XML--LibXML"

inherit rpm
