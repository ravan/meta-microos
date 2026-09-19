SUMMARY = "Vte-based Terminal Emulator"
DESCRIPTION = "termit is a terminal emulator based on the vte library. It includes tabs, \
bookmarks, and the ability to switch encodings."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "termit-3.1-1.24.aarch64.rpm"
RPM_HASH = "92509164f5c7fcc0a91cc24b2de3b3845818ec2418751ac6a66a85de2392d01f4720363cba226784b305a8a529cdd855b7b1705ef36a29f3fe45a1ce778e475e"

RPROVIDES:${PN} += "config-termit \
termit"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblua5.4.so.5 \
libpango-1.0.so.0 \
libvte-2.91.so.0"

inherit rpm
