SUMMARY = "GAP: Backtrack Search in Permutation Groups"
DESCRIPTION = "The Ferret package provides a C++ reimplementation of Jeffery Leon's Partition \
Backtrack framework for solving problems in permutation groups"
LICENSE = "MPL-2.0"

PV = "1.0.16"

RPM_NAME = "gap-ferret-1.0.16-1.4.aarch64.rpm"
RPM_HASH = "dc6829d03bdc8715e9fbde99a7189367882ba3e3857ce25674b05041ab42b1bee5dfc604eeefdc6f569dc8eaece13b0d342f73021095903c5c2c71fb28d5cf21"

RPROVIDES:${PN} += "gap-ferret"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
gap-core \
gap-gapdoc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
