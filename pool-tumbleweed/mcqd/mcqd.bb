SUMMARY = "Algorithm to find the maximum clique in a graph"
DESCRIPTION = "MaxCliqueDyn is an exact algorithm for finding a maximum clique in an undirected graph."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "mcqd-1.0.0-1.21.aarch64.rpm"
RPM_HASH = "9dfd59a5083e4ef95c99099d44c42a2ed48fd367a35b9b9c2c811d9a5166a8c45194183f2f5ab966b748cf90703e83c7e2cc0f58e7dbf11832efab73017787df"

RPROVIDES:${PN} += "mcqd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
