SUMMARY = "A generic and efficient menu for X"
DESCRIPTION = "dmenu is a dynamic menu for X, originally designed for dwm. It manages \
large numbers of user-defined menu items efficiently."
LICENSE = "MIT"

PV = "5.4"

RPM_NAME = "dmenu-5.4-1.3.aarch64.rpm"
RPM_HASH = "1ba9aefd727253f72d18b063d7459e2027909862ed1b3f8649ae3a17f1d0cb2a137d0b8a421cb0737bb3a5daadf2ead7d92a49c5c63f9a1240bbd9ccb8511056"

RPROVIDES:${PN} += "dmenu"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libc.so.6 \
libfontconfig.so.1"

inherit rpm
