SUMMARY = "C Source Parser and C Generator"
DESCRIPTION = "The gtk-sharp-gapi package includes the parser and code generator used \
by the GTK if you want to bind GObject-based libraries, or need to \
compile a project that uses it to bind such a library."
LICENSE = "GPL-2.0-only"

PV = "2.12.45"

RPM_NAME = "gtk-sharp2-gapi-2.12.45-6.3.aarch64.rpm"
RPM_HASH = "e771f27eb9267025676bf7514bd669507b23453465e5644206d4c469eaf671749de139223e1279d765cf6cf80155232c12b64e4806d5d5e7f3fd70c4a21d74b3"

RPROVIDES:${PN} += "gtk-sharp2-gapi \
mono-gapi-codegen \
mono-gapi-fixup \
mono-gapi-parser \
pkgconfig-gapi-2.0"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
/usr/bin/sh \
mono-System.Xml \
mono-mscorlib \
perl-XML-LibXML \
perl-XML-LibXML-Common \
perl-XML-SAX"

inherit rpm
