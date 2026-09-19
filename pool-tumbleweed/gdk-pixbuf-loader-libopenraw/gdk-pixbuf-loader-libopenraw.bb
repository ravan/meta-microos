SUMMARY = "gdk-pixbuf loader for libopenraw"
DESCRIPTION = "libopenraw is a library that aim at decoding digital camera RAW files. \
 \
This package provides a libopenraw-based gdk-pixbuf loader."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.7"

RPM_NAME = "gdk-pixbuf-loader-libopenraw-0.3.7-1.14.aarch64.rpm"
RPM_HASH = "9ede46fa970ece7beeffbb7a224e018b52d8c8fae03d50939cfcbfa2a757e87b754225506c16396a3f03d388b3efeffb97643e224bb418edf7abb8c77e60d07d"

RPROVIDES:${PN} += "gdk-pixbuf-loader-libopenraw \
libopenraw-pixbuf.so"

RDEPENDS:${PN} += "/usr/bin/sh \
gdk-pixbuf-query-loaders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libopenraw.so.9"

inherit rpm
