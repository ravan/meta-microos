SUMMARY = "A library to download and mirror FTP/HTTP sites"
DESCRIPTION = "Wget enables you to retrieve WWW documents or FTP files from a \
server. This can be done in script files or via the command line. \
 \
libwget which provides an interface to many useful functions used by \
Wget2."
LICENSE = "LGPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "libwget4-2.2.1-1.5.aarch64.rpm"
RPM_HASH = "a84eed0b5888bce9a575a3d6e25026d5b85acdb7ad0d21235d329c8e8ac6264318233dbc15ba2b996bdfb9de3a407806ee9c2d3d3106804edb4d00e781a8afb3"

RPROVIDES:${PN} += "libwget.so.4 \
libwget4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libgnutls.so.30 \
libidn2.so.0 \
libnghttp2.so.14 \
libpsl.so.5 \
libz.so.1 \
libzstd.so.1"

inherit rpm
