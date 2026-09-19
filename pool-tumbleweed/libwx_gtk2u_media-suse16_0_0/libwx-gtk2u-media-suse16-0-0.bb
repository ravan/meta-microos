SUMMARY = "wxWidgets media class library"
DESCRIPTION = "wxMediaCtrl is a class for displaying types of media, such as videos, \
audio files, natively through native codecs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk2u_media-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "a5be903702b282e35c591ea673fa79556306dc5f521df14046d8df6419ac61eb22e96f05aab01b952bd8b8b775e6b8739539a58263209c50dc74cb23fc4a96f3"

RPROVIDES:${PN} += "libwx-gtk2u-media-suse.so.16.0.0 \
libwx-gtk2u-media-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
