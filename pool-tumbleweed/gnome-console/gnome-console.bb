SUMMARY = "A minimal terminal for GNOME"
DESCRIPTION = "Console is supposed to be a simple terminal emulator for the average \
user to carry out simple cli tasks. \
However, it is not trying to replace GNOME Terminal/Tilix; these \
advanced tools are great for developers and administrators. \
GNOME console rather aims to serve the casual linux user who rarely \
needs a terminal."
LICENSE = "GPL-3.0-only"

PV = "50.0"

RPM_NAME = "gnome-console-50.0-1.3.aarch64.rpm"
RPM_HASH = "fa6d1b67c5efd65480f43ec891a3257898c1ac4d4e16ce8959e62ba279a9294b90ff859617fb546c178b5a8bcc27b7cdf699d31e77590967383c6eab2259ca3b"

RPROVIDES:${PN} += "console \
gnome-console \
nautilus-extension-console"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtop-2.0.so.11 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libvte-2.91-gtk4.so.0"

inherit rpm
