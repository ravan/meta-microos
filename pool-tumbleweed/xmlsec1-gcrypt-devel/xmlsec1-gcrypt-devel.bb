SUMMARY = "GCrypt crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with GCrypt."
LICENSE = "MIT"

PV = "1.2.42"

RPM_NAME = "xmlsec1-gcrypt-devel-1.2.42-1.8.aarch64.rpm"
RPM_HASH = "8c623c89614f2b8f0c746ab652b78db89674260463b713cd86bf6ef5632dec89ba7dd49bbbc87c74197466c8f5d2549e320e4c8e9abe347578f39ae462e7349c"

RPROVIDES:${PN} += "pkgconfig-xmlsec1-gcrypt \
xmlsec1-gcrypt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlsec1-gcrypt1 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
xmlsec1-devel"

inherit rpm
