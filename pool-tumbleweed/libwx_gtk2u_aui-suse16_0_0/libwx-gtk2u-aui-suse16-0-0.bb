SUMMARY = "wxWidgets advanced user interface docking library"
DESCRIPTION = "The Advanced User Interface docking library of wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk2u_aui-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "18945feddedc39ffb99c5bd8ce552faafdefaf86b18cddaf47497ab10e50acefda42d025c6a7f473951c3d8ebfe4a40f54016340edb48679509ffe72510b92ed"

RPROVIDES:${PN} += "libwx-gtk2u-aui-suse.so.16.0.0 \
libwx-gtk2u-aui-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
