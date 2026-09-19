SUMMARY = "Installed tests for xdg-dbus-proxy"
DESCRIPTION = "Installed tests for xdg-dbus-proxy, compatible with gnome-desktop-testing-runner."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.8"

RPM_NAME = "xdg-dbus-proxy-tests-0.1.8-1.1.aarch64.rpm"
RPM_HASH = "ed7e6ddc76e7c4cbbd228440fdc52950376196e221dafab894fdc34a0458b597f5ba7a6be603b8cef8f5786b8a0233e6a7f6d965641f230ec24f82855c4ef9a8"

RPROVIDES:${PN} += "xdg-dbus-proxy-tests"

RDEPENDS:${PN} += "dbus-1 \
gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
xdg-dbus-proxy"

inherit rpm
