SUMMARY = "A utility for browsing and installing GNOME Shell Extensions"
DESCRIPTION = "A native tool for browsing, installing, and managing GNOME Shell Extensions."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.5"

RPM_NAME = "extension-manager-0.6.5-1.6.aarch64.rpm"
RPM_HASH = "3a27c8c4ceecc1c5986074302c91d7d9057e910e1ab2e2b743d9b5f884226d75cd47619dd7e34893781fbc176769c2c5774fdf23c32662417d02f6c3ccd7b3cc"

RPROVIDES:${PN} += "extension-manager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libbacktrace.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libsoup-3.0.so.0 \
libxml2.so.16 \
unzip"

inherit rpm
