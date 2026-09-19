SUMMARY = "The 'thumbnailgtk' libextractor plugin"
DESCRIPTION = "This package ships the 'thumbnailgtk' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-thumbnailgtk-1.14-1.2.aarch64.rpm"
RPM_HASH = "e2404e94e94b43d0435604e33a0fe0571b21b20ff750ff5fd69b4551ff984a425957a6862d90d3947194d606495cb490419df0d6f265cf397851e9d38e00a656"

RPROVIDES:${PN} += "libextractor-plugins-thumbnailgtk \
libextractor-thumbnailgtk.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgobject-2.0.so.0 \
libmagic.so.1"

inherit rpm
