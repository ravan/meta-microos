SUMMARY = "GNUTls crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with GNUTls."
LICENSE = "MIT"

PV = "1.2.42"

RPM_NAME = "xmlsec1-gnutls-devel-1.2.42-1.8.aarch64.rpm"
RPM_HASH = "39a8e31ecc250821c89802cf54200921833ea43e86355086c10dcbace2f282bbbe2b35baf0db8260add656bbbf2fc25e38be0edc0b592bf75c9dd3b9cd3b36d8"

RPROVIDES:${PN} += "pkgconfig-xmlsec1-gnutls \
xmlsec1-gnutls-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnutls-devel \
libgcrypt-devel \
libxmlsec1-gnutls1 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
xmlsec1-devel \
xmlsec1-openssl-devel"

inherit rpm
