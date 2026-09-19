SUMMARY = "Development files for webkitgtk4"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.52.6"

RPM_NAME = "webkitgtk4-devel-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "ea44d2d5141562da0a6e11bcd3bdec2677faafbdb152a4b5888e401f91c6495c6c83d88c2eb714c1543ce9ce895a852f815f2ddeaa97a73d72d8284da9fa706a"

RPROVIDES:${PN} += "pkgconfig-javascriptcoregtk-6.0 \
pkgconfig-webkitgtk-6.0 \
pkgconfig-webkitgtk-web-process-extension-6.0 \
webkitgtk4-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjavascriptcoregtk-6-0-1 \
libwebkitgtk-6-0-4 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
pkgconfig-javascriptcoregtk-6.0 \
pkgconfig-libsoup-3.0 \
typelib-1-0-JavaScriptCore-6-0 \
typelib-1-0-WebKit-6-0 \
typelib-1-0-WebKitWebProcessExtension-6-0"

inherit rpm
