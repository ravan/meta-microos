SUMMARY = "Introspection bindings for webkitgtk4"
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

RPM_NAME = "typelib-1_0-WebKitWebProcessExtension-6_0-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "4b907e24b6cf1dde05939643f962a2b77c3f1b421111e1623affbd4e9d86bdff74d408e06aa9ec15f5b7489ead0245347492df294c2c99ae207f709498b3ef82"

RPROVIDES:${PN} += "typelib-1-0-WebKitWebProcessExtension-6-0 \
typelib-WebKitWebProcessExtension"

RDEPENDS:${PN} += "libjavascriptcoregtk-6.0.so.1 \
libwebkitgtk-6.0.so.4 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-JavaScriptCore \
typelib-Pango \
typelib-PangoCairo \
typelib-Soup \
typelib-cairo \
typelib-freetype2"

inherit rpm
