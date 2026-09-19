SUMMARY = "wxWidgets media class library"
DESCRIPTION = "wxMediaCtrl is a class for displaying types of media, such as videos, \
audio files, natively through native codecs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_media-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "fc5bfe7cd1f5b82e4c7b37d4f77a2a49c266055706d262e653274fa27b067cd885886972a34dde512a6e9ed330779b5ed710d2d5ce48a32adf8648e997161391"

RPROVIDES:${PN} += "libwx-gtk3u-media-suse.so.16.0.0 \
libwx-gtk3u-media-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
