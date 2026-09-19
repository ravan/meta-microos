SUMMARY = "An aquarium in the root window"
DESCRIPTION = "A nice little aquarium with funny fish -- yet another background screen."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "xfishtank-3.3.2-1.5.aarch64.rpm"
RPM_HASH = "e1014450dd336d18f3edb7cab181909d129784864eeee22f39ae7d7366a9eed0c764b03e6968bb9a6d51c9fa87bce18c574e2c14db54824f9d819e2cbe8bda6c"

RPROVIDES:${PN} += "xfishtank"

RDEPENDS:${PN} += "gnome-icon-theme \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXpm.so.4 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
