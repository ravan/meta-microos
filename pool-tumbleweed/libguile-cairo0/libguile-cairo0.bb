SUMMARY = "Guile cairo libary"
DESCRIPTION = "Libraries for Guile bindings for Cairo."
LICENSE = "LGPL-3.0-or-later"

PV = "1.11.2"

RPM_NAME = "libguile-cairo0-1.11.2-1.13.aarch64.rpm"
RPM_HASH = "d944a05ac561bec78df253386f3597b1bd461e51b6e83b61d9f81b09da8a9fefa483ce46342169fb3c27b04cb00ea7edae9b6adea1199607d7c6e5748be6817c"

RPROVIDES:${PN} += "libguile-cairo.so.0 \
libguile-cairo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libguile-3.0.so.1"

inherit rpm
