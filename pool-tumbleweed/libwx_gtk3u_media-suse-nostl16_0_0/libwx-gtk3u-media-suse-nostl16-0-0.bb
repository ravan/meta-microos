SUMMARY = "wxWidgets media class library"
DESCRIPTION = "wxMediaCtrl is a class for displaying types of media, such as videos, \
audio files, natively through native codecs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_media-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "0704eab97c851eb3f5a99911eb54701490011be5988623523235d1db2921a68149c1a130f58a7bc041a040f84f230938a1bef6458a2f9aeda9e226ad98ae4fe6"

RPROVIDES:${PN} += "libwx-gtk3u-media-suse-nostl.so.16.0.0 \
libwx-gtk3u-media-suse-nostl16-0-0"

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
libwx-baseu-suse-nostl.so.16.0.0 \
libwx-gtk3u-core-suse-nostl.so.16.0.0"

inherit rpm
