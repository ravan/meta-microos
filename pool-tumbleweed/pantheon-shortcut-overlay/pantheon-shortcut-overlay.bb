SUMMARY = "A native OS-wide shortcut overlay to be launched by Gala"
DESCRIPTION = "This Granite applet should read window manager and OS keyboard shortcuts from \
dconf and expose them to the user when launched."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-shortcut-overlay-8.1.0-1.5.aarch64.rpm"
RPM_HASH = "aaf92abc29f197f2b0b329e2ca00de331fe8df93373c6bb1ee7b760c8506b01c68fdbc185cff7a433481ec41186fc4208f9a9d737d505f92f4ffa3f73b24b3c1"

RPROVIDES:${PN} += "elementary-shortcut-overlay \
pantheon-shortcut-overlay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libpantheon-wayland.so.1"

inherit rpm
