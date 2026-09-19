SUMMARY = "OpenSCAP C Library"
DESCRIPTION = "The OpenSCAP C Library for easy integration with SCAP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.4"

RPM_NAME = "libopenscap33-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "7b1f48fe24ea488c7701b597c35517f5d13a27ecfdd60dc515a82bd8321193e92bdebc5babab4baec63690694ef6969be67457715151c9cdb1a7bd4e0a0a77fd"

RPROVIDES:${PN} += "libopenscap.so.33 \
libopenscap33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libblkid.so.1 \
libbz2.so.1 \
libc.so.6 \
libcap.so.2 \
libcurl.so.4 \
libdbus-1.so.3 \
libexslt.so.0 \
libgcrypt.so.20 \
libpcre2-8.so.0 \
librpm.so.10 \
librpmio.so.10 \
libselinux.so.1 \
libxml2.so.16 \
libxmlsec1-openssl.so.1 \
libxmlsec1.so.1 \
libxslt.so.1 \
libyaml-0.so.2"

inherit rpm
