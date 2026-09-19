SUMMARY = "Suite of gimp plugins for texture synthesis"
DESCRIPTION = "This package is a set of plugins for use with the Gimp program. \
The package includes: \
 \
- resynthesizer plugin engine (without a GUI) \
- resynthesizer-gui plugin control panel for the engine \
- various plugins (in Python language) that call the resynthesizer engine"
LICENSE = "GPL-3.0-or-later"

PV = "3.0.1+git21.a05427e"

RPM_NAME = "gimp-plugin-resynthesizer-3.0.1+git21.a05427e-1.2.aarch64.rpm"
RPM_HASH = "9017ec26f031df84fc5a9288051d847f663b658bf5348315b9e01a4db43b4686c8d5fd138dccffd5271396c225d0237c2e5f7e8247d418cdcb7617af2203bb9b"

RPROVIDES:${PN} += "gimp-plugin-resynthesizer"

RDEPENDS:${PN} += "/usr/bin/gimp-script-fu-interpreter-3.0 \
ld-linux-aarch64.so.1 \
libbabl-0.1.so.0 \
libc.so.6 \
libgegl-0.4.so.0 \
libgimp-3.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
