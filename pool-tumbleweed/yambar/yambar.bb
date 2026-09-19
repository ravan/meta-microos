SUMMARY = "Modular statusbar for X11 and Wayland"
DESCRIPTION = "Simplistic and highly configurable status panel for X and Wayland."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "yambar-1.11.0-3.2.aarch64.rpm"
RPM_HASH = "ed83bc37145ccdc0875bc6513603d902426a22de983ba7795335fe6dd83fab46af8c75fc5fda529a4cc506dc5e7dd666ace3e993ac83e1daa87f328da579d6ed"

RPROVIDES:${PN} += "yambar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfcft.so.4 \
libjson-c.so.5 \
libm.so.6 \
libmpdclient.so.2 \
libpipewire-0.3.so.0 \
libpixman-1.so.0 \
libpulse.so.0 \
libudev.so.1 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxcb-cursor.so.0 \
libxcb-errors.so.0 \
libxcb-randr.so.0 \
libxcb-render.so.0 \
libxcb-util.so.1 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libyaml-0.so.2"

inherit rpm
