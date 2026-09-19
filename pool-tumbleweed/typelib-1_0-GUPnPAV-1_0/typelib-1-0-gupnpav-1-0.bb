SUMMARY = "Library to ease the handling and implementation of UPnP A/V profiles -- Introspection bindings"
DESCRIPTION = "GUPnP A/V is a small utility library that aims to ease the handling and \
implementation of UPnP A/V profiles. \
 \
This package provides the GObject Introspection bindings for GUPnP A/V."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.5"

RPM_NAME = "typelib-1_0-GUPnPAV-1_0-0.14.5-1.3.aarch64.rpm"
RPM_HASH = "2a47ff2fbe090a08aae5bb840239590ec6c57b7870b9ae22e912b2c452cc27da65fe856206dc625391c0050a08d50a6735841674e3cc8a398abb24f77c8b5a72"

RPROVIDES:${PN} += "typelib-1-0-GUPnPAV-1-0 \
typelib-GUPnPAV"

RDEPENDS:${PN} += "libgupnp-av-1.0.so.3 \
typelib-GLib \
typelib-GObject \
typelib-libxml2"

inherit rpm
