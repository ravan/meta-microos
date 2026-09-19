SUMMARY = "GAP: Digraphs and multigraphs"
DESCRIPTION = "The Digraphs package is a GAP package containing methods for digraphs \
and multidigraphs."
LICENSE = "GPL-3.0-or-later"

PV = "1.15.0"

RPM_NAME = "gap-digraphs-1.15.0-1.2.aarch64.rpm"
RPM_HASH = "3a33ec5abc7c4358803338e791682a7aca9a9c69af64bd8779feb698a8f7927d264b79c3fb93bfb758350d1ab2bf0f1b71589fe82ac77cff9099041d7b4bd85d"

RPROVIDES:${PN} += "bundled-bliss \
gap-digraphs"

RDEPENDS:${PN} += "gap-core \
gap-datastructures \
gap-io \
gap-orb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libplanarity.so.4 \
libstdc++.so.6"

inherit rpm
