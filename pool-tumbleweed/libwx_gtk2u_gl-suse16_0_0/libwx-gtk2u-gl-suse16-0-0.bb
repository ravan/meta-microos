SUMMARY = "wxWidgets OpenGL integration library"
DESCRIPTION = "This library contains the wxGLCanvas class for integration of OpenGL \
with wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk2u_gl-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "93b203286473fe65d3b1fd09c2038365231ff895727e3508515fdc19d542b0ed85cbac10cde5cf1027f3031402e7d7f497c4919b7c59f29f949c9368e8cb111d"

RPROVIDES:${PN} += "libwx-gtk2u-gl-suse.so.16.0.0 \
libwx-gtk2u-gl-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
