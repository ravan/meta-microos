SUMMARY = "Shared and private libraries of molequeue"
DESCRIPTION = "Shared and private libraries of molequeue."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "molequeue-libs0-0.9.0-4.3.aarch64.rpm"
RPM_HASH = "59b43f423dc780fb58e2b0d3005ce104d1e61ad9e5e8503889d862c19776dbfb675631c6d8f999ca6cc3509d95c593b9c8dc6a8952c6ff9902fc2f1477fd93c0"

RPROVIDES:${PN} += "libMoleQueueClient.so \
libMoleQueueServerCore.so \
molequeue-libs0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
