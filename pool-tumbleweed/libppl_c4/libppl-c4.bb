SUMMARY = "C interface of the Parma Polyhedra Library"
DESCRIPTION = "Shared library for the Parma Polyhedra Library C bindings."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "libppl_c4-1.2-3.12.aarch64.rpm"
RPM_HASH = "b3506055894b0b0e733b396ea12069f07263ec27c17ea91ff217a6d27711f3321c73b83121f3e4cca43e390bda13a1f95499829cfc1859e88a03de13ac150aaa"

RPROVIDES:${PN} += "libppl-c.so.4 \
libppl-c4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libppl.so.14 \
libstdc++.so.6"

inherit rpm
