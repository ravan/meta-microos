SUMMARY = "Introspection bindings for the entangle plugins"
DESCRIPTION = "Entangle provides a graphical interface for 'tethered shooting', aka \
taking photographs with a digital camera completely controlled from \
the computer. \
 \
This package provides the GObject Introspection bindings for entangle \
plugins"
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "typelib-1_0-Entangle-0_1-3.0-3.2.aarch64.rpm"
RPM_HASH = "95e422344f7998f3e0eb24eace6513504a888c23f460536c62d2a19323e96532ec5d8bfb06a7f56ff782082607ab139cbe26888155dd25940298169b06c5f957"

RPROVIDES:${PN} += "typelib-1-0-Entangle-0-1 \
typelib-Entangle"

RDEPENDS:${PN} += ""

inherit rpm
