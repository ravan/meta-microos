SUMMARY = "Polkit authorization designed for Pantheon"
DESCRIPTION = "An agent for Polkit authorization designed for Pantheon desktop environment."
LICENSE = "LGPL-2.1-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-agent-polkit-8.1.0-1.1.aarch64.rpm"
RPM_HASH = "79e3e12ebc5e2f343793f0e7616cf49aca47914a9b79e806d13a2a98518d957953ab006044fdcc8090406157cc94a5aeb74afe166e607d5b591d3b7cfb1600b8"

RPROVIDES:${PN} += "pantheon-agent-polkit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libpantheon-wayland.so.1 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0"

inherit rpm
