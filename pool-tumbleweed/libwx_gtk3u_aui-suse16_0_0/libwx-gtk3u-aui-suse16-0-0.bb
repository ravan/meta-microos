SUMMARY = "wxWidgets advanced user interface docking library"
DESCRIPTION = "The Advanced User Interface docking library of wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_aui-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "59cf99a9f4c2788935f7503574ac6dcfa53d09f65cae9c5796163402c1bbe9ae56905f5cc0b0659d8792cdddc8bdfab5e26e8fe37615fc25f76366d9b29b1906"

RPROVIDES:${PN} += "libwx-gtk3u-aui-suse.so.16.0.0 \
libwx-gtk3u-aui-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
