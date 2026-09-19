SUMMARY = "Bar program for sway"
DESCRIPTION = "Bar program for sway."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "swaybar-1.12-12.3.aarch64.rpm"
RPM_HASH = "c118687c708a0fef4f5afbfca580a2a68e77d6b2c9fe49a9fc6c3a3b2ffcf1000c9def199ddce4e6ffd0262b007e25b8bac13281e550e3ba7b7f98c0ed96cd46"

RPROVIDES:${PN} += "swaybar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-c.so.5 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsystemd.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
sway"

inherit rpm
