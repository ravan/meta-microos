SUMMARY = "Introspection bindings for Template-GLib"
DESCRIPTION = "Template-GLib is a library for generating text based on a template and \
user defined state. Template-GLib does not use a language runtime, so it is \
safe to use from any GObject-Introspectable language. \
 \
Template-GLib allows accessing properties on GObjects as well as call \
simple methods via GObject-Introspection. \
 \
This package provides the introspection bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "3.40.0"

RPM_NAME = "typelib-1_0-Template-1_0-3.40.0-1.4.aarch64.rpm"
RPM_HASH = "f3c66524cd64e1777321b3839197552b8ed70f0d8b5383a0a4e07b33ed5a5a2cb8f67c41b055992b98052d9a89a9654d41869e3eb10b6ae7099a0dde3de9eeea"

RPROVIDES:${PN} += "typelib-1-0-Template-1-0 \
typelib-Template"

RDEPENDS:${PN} += "libtemplate-glib-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
