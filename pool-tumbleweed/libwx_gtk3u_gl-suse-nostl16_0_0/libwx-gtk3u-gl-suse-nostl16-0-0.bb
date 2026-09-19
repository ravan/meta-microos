SUMMARY = "wxWidgets OpenGL integration library"
DESCRIPTION = "This library contains the wxGLCanvas class for integration of OpenGL \
with wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_gl-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "b5533e276b01f68efff2703498fa6461a796f4fd827b0be224a39445ba94b78c62db9b78bd6a6baa935f2240aea0420aed7675a88eea3db1fd1e2ce705eaee70"

RPROVIDES:${PN} += "libwx-gtk3u-gl-suse-nostl.so.16.0.0 \
libwx-gtk3u-gl-suse-nostl16-0-0"

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
libwx-baseu-suse-nostl.so.16.0.0 \
libwx-gtk3u-core-suse-nostl.so.16.0.0"

inherit rpm
