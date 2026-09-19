SUMMARY = "wxWidgets HTML/browser class library"
DESCRIPTION = "Library for a wxWidgets control that can be used to render web \
(HTML / CSS / JavaScript) documents."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_webview-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "e25e5f0a2f3db11c648e3ddb4ba62f2bf44fc99892bd23d2e07ba4aff2702145c7549288aadf9419efaf3e1fd71200c7e1e8a4dd80e4ada68ad7724c77bdb6d0"

RPROVIDES:${PN} += "libwx-gtk3u-webview-suse.so.16.0.0 \
libwx-gtk3u-webview-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjavascriptcoregtk-4.1.so.0 \
libstdc++.so.6 \
libwebkit2gtk-4.1.so.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
