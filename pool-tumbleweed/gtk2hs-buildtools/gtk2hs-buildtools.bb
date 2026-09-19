SUMMARY = "Tools to build the Gtk2Hs suite of User Interface libraries"
DESCRIPTION = "This package provides a set of helper programs necessary to build the Gtk2Hs \
suite of libraries. These tools include a modified c2hs binding tool that is \
used to generate FFI declarations, a tool to build a type hierarchy that \
mirrors the C type hierarchy of GObjects found in glib, and a generator for \
signal declarations that are used to call back from C to Haskell. \
These tools are not needed to actually run Gtk2Hs programs."
LICENSE = "GPL-2.0-only"

PV = "0.13.12.0"

RPM_NAME = "gtk2hs-buildtools-0.13.12.0-1.19.aarch64.rpm"
RPM_HASH = "45f73529ca854932fdc1890a7566e3a863e4afd95412541db24262ce81edb08313da394a66dcb785286e040f0b8561a49e716844eefc20954246be6081219167"

RPROVIDES:${PN} += "gtk2hs-buildtools"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
