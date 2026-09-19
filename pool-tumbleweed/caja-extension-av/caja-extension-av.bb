SUMMARY = "Audio Video Properties plugin"
DESCRIPTION = "caja-extension-av allows one to view Properties of audio and video files."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-av-1.28.0-2.11.aarch64.rpm"
RPM_HASH = "cc2c0027a3946d2193b913a1a52471e7f66af25b2bb406e0680f2e46b1fecc5ca9b53eedd2a5833b799c48dba1a8923f114617c1a1ef4d77423013e88c8c071a"

RPROVIDES:${PN} += "caja-extension-av \
libcaja-av.so"

RDEPENDS:${PN} += "caja \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0"

inherit rpm
