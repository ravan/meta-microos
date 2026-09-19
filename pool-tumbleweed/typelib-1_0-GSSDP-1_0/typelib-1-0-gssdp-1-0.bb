SUMMARY = "Lib for resource discovery and announcement over SSDP - Introspection bindings"
DESCRIPTION = "gssdp offers a GObject-based API for handling resource discovery and \
announcement over SSDP. \
 \
This package provides the GObject Introspection bindings for gssdp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.6"

RPM_NAME = "typelib-1_0-GSSDP-1_0-1.6.6-1.3.aarch64.rpm"
RPM_HASH = "ea4352385397d853eac3a3a5bbc949a51629a82f6091e83bd442bbc2590edf6db8c13a72600d895c95d3b61fa0a1b98e45f3335370fccbc00a85963457d169a2"

RPROVIDES:${PN} += "typelib-1-0-GSSDP-1-0 \
typelib-GSSDP"

RDEPENDS:${PN} += "libgssdp-1.6.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Soup"

inherit rpm
