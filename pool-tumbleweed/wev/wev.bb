SUMMARY = "Wayland event viewer"
DESCRIPTION = "This is a tool for debugging events on a Wayland window, analagous to \
the X11 tool xev."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "wev-1.1.0-1.6.aarch64.rpm"
RPM_HASH = "a9cc5561d24d16ea2e2de9c57539f4e1966927921cac721798cac25457d05e92580c2aa49f61203ea8db280e766e16e2f2eb15876913f79215a75b903c97a513"

RPROVIDES:${PN} += "wev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
