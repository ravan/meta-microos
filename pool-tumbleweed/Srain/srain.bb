SUMMARY = "An IRC client"
DESCRIPTION = "IRC client written in GTK3+."
LICENSE = "GPL-3.0-or-later & ISC"

PV = "1.8.1"

RPM_NAME = "Srain-1.8.1-1.5.aarch64.rpm"
RPM_HASH = "64ef94524eb9361d0d9fbeb20c7b956a520d9bebb4537488c06bd19590db922691fcd2710393a8261699cccd486a943ffe2581e2fe19faa34074321942ad854a"

RPROVIDES:${PN} += "Srain \
config-Srain"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libayatana-appindicator3.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libconfig.so.15 \
libcrypto.so.3 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0"

inherit rpm
