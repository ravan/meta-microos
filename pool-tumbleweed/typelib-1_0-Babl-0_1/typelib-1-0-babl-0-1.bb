SUMMARY = "Introspection bindings for babl"
DESCRIPTION = "babl is a dynamic, any to any, pixel format translation library. \
 \
This package provides the GObject Introspection bindings for babl."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.1.128"

RPM_NAME = "typelib-1_0-Babl-0_1-0.1.128-1.1.aarch64.rpm"
RPM_HASH = "a92d972de90aaea97784f0428c32599fb68e3183fc93886d44dcba6f95f5f6744ad2ae9e07aee5d3d8cc69e49ae4a927253f72d7e2e6f8d605aa8f9eb6cb8dc3"

RPROVIDES:${PN} += "typelib-1-0-Babl-0-1 \
typelib-Babl"

RDEPENDS:${PN} += "libbabl-0.1.so.0"

inherit rpm
