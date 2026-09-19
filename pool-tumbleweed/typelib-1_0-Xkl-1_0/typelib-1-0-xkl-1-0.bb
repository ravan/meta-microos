SUMMARY = "Introspection bindings for libxklavier"
DESCRIPTION = "This library allows you to simplify XKB-related development. \
 \
This package provides the GObject Introspection bindings for \
libxklavier."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4"

RPM_NAME = "typelib-1_0-Xkl-1_0-5.4-2.11.aarch64.rpm"
RPM_HASH = "ce0a60d04e5c18146f90a860477643961825f8495bf027046b5ab4a0b7b6ba5bf78c2ab5910cbcef3060d7c5d054f5ad07dca223ec1f9bfc1ae8261f1bb9f9bb"

RPROVIDES:${PN} += "typelib-1-0-Xkl-1-0 \
typelib-Xkl"

RDEPENDS:${PN} += "libxklavier.so.16 \
typelib-GLib \
typelib-GObject \
typelib-xlib"

inherit rpm
