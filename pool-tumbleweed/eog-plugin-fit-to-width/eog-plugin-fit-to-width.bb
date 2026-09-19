SUMMARY = "Eog fit to width plugin"
DESCRIPTION = "The Eye of Gnome fit to width plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "eog-plugin-fit-to-width-44.1-2.3.aarch64.rpm"
RPM_HASH = "7f9e2f2f440a3773a2f4b9525eb8561dd845771953a8df12831f7b67fdec691f33fd8eb5e28f034e0348e3d4a3b4956cc6d12165cdbb008835852f9ab7f9ae23"

RPROVIDES:${PN} += "eog-plugin-fit-to-width \
eog-plugins-/usr/lib64/eog/plugins/fit-to-width.plugin \
libfit-to-width.so"

RDEPENDS:${PN} += "eog-plugins-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeog.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.1"

inherit rpm
