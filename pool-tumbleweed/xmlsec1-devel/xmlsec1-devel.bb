SUMMARY = "Libraries, includes for XML Signatures/Encryption"
DESCRIPTION = "Libraries, includes, etc. you can use to develop applications with XML Digital \
Signatures and XML Encryption support."
LICENSE = "MIT"

PV = "1.2.42"

RPM_NAME = "xmlsec1-devel-1.2.42-1.8.aarch64.rpm"
RPM_HASH = "51d11925c89681e47ff49513c9200c241a15849fce77b78c4dc95fb2073993ca54d774cedefb1d3832f1e6b24d591d6d2c3a3f665b3a65f482155be64870fd02"

RPROVIDES:${PN} += "pkgconfig-xmlsec1 \
xmlsec1-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libxml2-devel \
libxmlsec1-1 \
libxslt-devel \
openssl-devel \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-zlib"

inherit rpm
