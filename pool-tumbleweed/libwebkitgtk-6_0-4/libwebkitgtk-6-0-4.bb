SUMMARY = "Library for rendering web content, GTK+ Port"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.52.6"

RPM_NAME = "libwebkitgtk-6_0-4-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "a92904c86b68c4b48ba46183ff176bbd8f2eddc9e6f864543885a20339def359b9adab96b4cd170d3f0e5464c224f241902e754cabb727397cdad24d4554d967"

RPROVIDES:${PN} += "WebKitGTK-6.0 \
libwebkit2gtk4 \
libwebkitgtk-6-0-4 \
libwebkitgtk-6.0.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
bubblewrap \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libavif.so.16 \
libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libenchant-2.so.2 \
libepoxy.so.0 \
libexpat.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstfft-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libharfbuzz-icu.so.0 \
libharfbuzz.so.0 \
libhyphen.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libjavascriptcoregtk-6-0-1 \
libjavascriptcoregtk-6.0.so.1 \
libjpeg.so.8 \
libjxl.so.0.11 \
liblcms2.so.2 \
libm.so.6 \
libmanette-0.2.so.0 \
libpango-1.0.so.0 \
libpng16.so.16 \
libseccomp.so.2 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libspiel-1.0.so \
libsqlite3.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libtasn1.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libxml2.so.16 \
libxslt.so.1 \
libz.so.1 \
webkitgtk-6-0-injected-bundles \
xdg-dbus-proxy"

inherit rpm
