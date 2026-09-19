SUMMARY = "Development files for webkitgtk3"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.52.6"

RPM_NAME = "webkitgtk3-devel-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "fe0cab7ea0e57c9ea56d4044a8697be5ba78bfd42c1f7f7e9097bc8061b039a54e03d9398ea2da1ac3c8fb09ee0d7b10b370798a1bd18ed269af645037d69c32"

RPROVIDES:${PN} += "pkgconfig-javascriptcoregtk-4.1 \
pkgconfig-webkit2gtk-4.1 \
pkgconfig-webkit2gtk-web-extension-4.1 \
webkitgtk3-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjavascriptcoregtk-4-1-0 \
libwebkit2gtk-4-1-0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-javascriptcoregtk-4.1 \
pkgconfig-libsoup-3.0 \
typelib-1-0-JavaScriptCore-4-1 \
typelib-1-0-WebKit2-4-1 \
typelib-1-0-WebKit2WebExtension-4-1"

inherit rpm
