SUMMARY = "Introspection bindings for webkitgtk3"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more. \
 \
This package provides the GObject Introspection bindings for the GTK+ \
port of WebKit2."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.52.6"

RPM_NAME = "typelib-1_0-WebKit2WebExtension-4_1-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "4b4c56a6097f5f234f92d1c188d19904f11ba711c1783240d431cfa44f614380bf36d96bf892c7ba699b5d22a1079b6a15071a53c19a77186a16e34382c92e07"

RPROVIDES:${PN} += "typelib-1-0-WebKit2WebExtension-4-1 \
typelib-WebKit2WebExtension"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.1.so.0 \
libwebkit2gtk-4.1.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-JavaScriptCore \
typelib-Pango \
typelib-Soup \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
