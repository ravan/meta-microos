SUMMARY = "The 'ogg' libextractor plugin"
DESCRIPTION = "This package ships the 'ogg' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-ogg-1.14-1.2.aarch64.rpm"
RPM_HASH = "ee4ab01ac22362a5d139d66f925b202c850edcaa725cfecb81f148633dcb052a7eaf0f00d48b442a0fa1ee2531ca8d84d5efd20c0bc3884b1dc0d3fd439fa52a"

RPROVIDES:${PN} += "libextractor-ogg.so \
libextractor-plugins-ogg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvorbis.so.0 \
libvorbisfile.so.3"

inherit rpm
