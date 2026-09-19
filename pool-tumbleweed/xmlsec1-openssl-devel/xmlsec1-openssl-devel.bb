SUMMARY = "OpenSSL crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with OpenSSL"
LICENSE = "MIT"

PV = "1.2.42"

RPM_NAME = "xmlsec1-openssl-devel-1.2.42-1.8.aarch64.rpm"
RPM_HASH = "28fb64dc53318dde53085e0518360c4f05c762f0dc17b9d7c46857d9e9e12401a741397f1ab321aef58539a0b6173966c525b8ea97c7c586182e123ddd15f2aa"

RPROVIDES:${PN} += "pkgconfig-xmlsec1-openssl \
xmlsec1-openssl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlsec1-openssl1 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
xmlsec1-devel"

inherit rpm
