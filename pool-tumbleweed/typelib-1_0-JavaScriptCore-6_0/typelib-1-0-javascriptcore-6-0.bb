SUMMARY = "Introspection bindings for the GTK+ port of the JavaScript Core Engine"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more. \
 \
This package provides the GObject Introspection bindings for the GTK+ \
port of the JavaScript Core engine."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.52.6"

RPM_NAME = "typelib-1_0-JavaScriptCore-6_0-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "1cd977c30ab9e438ec08b7a0fba5447044a6f842b58b7c5a1d61cace1eb7e070e1b6d7c17712c084012c3ae12d2f1cb6d47e5efaec82db715ec37f1f42a4bf0c"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-6-0 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-6.0.so.1 \
typelib-GLib \
typelib-GObject"

inherit rpm
