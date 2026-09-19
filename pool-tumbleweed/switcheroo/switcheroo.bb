SUMMARY = "Convert and manipulate images"
DESCRIPTION = "Switcheroo is designed to give you a simple, quick, and easy-to-use tool \
to convert and manipulate your images in whatever way you like. It is \
built on top of the most advanced image editing libraries, ImageMagick."
LICENSE = "GPL-3.0-only"

PV = "2.5.1"

RPM_NAME = "switcheroo-2.5.1-1.7.aarch64.rpm"
RPM_HASH = "8be0f40f769b7c8995611160467ecbd15f491cc923dd67ee648d498ec057d8010cc2450853d0fd2ba9b937eff4518dcb647396c2c2c38bc6b0a936700cb7e5a4"

RPROVIDES:${PN} += "switcheroo"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
