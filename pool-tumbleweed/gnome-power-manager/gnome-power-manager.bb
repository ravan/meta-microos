SUMMARY = "Power Management for GNOME"
DESCRIPTION = "GNOME Power Manager is a GNOME session daemon that acts as a policy \
agent. It listens for system events and responds with \
user-configurable actions."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-power-manager-50.0-1.3.aarch64.rpm"
RPM_HASH = "ae9f9bee0ac953d582ed718c8d2b8c693e5f65f99fa29d7be900120f0c4308d491af88fa8a527c38864fcfe9d2c20617597a3a7532bebb3d289c7895ab257417"

RPROVIDES:${PN} += "gnome-power-manager"

RDEPENDS:${PN} += "gnome-session-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libupower-glib.so.3 \
upower"

inherit rpm
