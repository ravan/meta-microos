SUMMARY = "wxWidgets OpenGL integration library"
DESCRIPTION = "This library contains the wxGLCanvas class for integration of OpenGL \
with wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_gl-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "9d6bfbcd8b94cec3c415256add072831840a14ee363ec6ed111ce032549717eddc26f72c6cfc47b969b1ca43aad00d292b4f6783f2c8b0660ba7a6cf28296cfe"

RPROVIDES:${PN} += "libwx-gtk3u-gl-suse.so.16.0.0 \
libwx-gtk3u-gl-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
