SUMMARY = "Userspace Read-Copy-Update Library"
DESCRIPTION = "liburcu is a LGPLv2.1 userspace RCU (read-copy-update) library. This data \
synchronization library provides read-side access which scales linearly with \
the number of cores. It does so by allowing multiples copies of a given data \
structure to live at the same time, and by monitoring the data structure \
accesses to detect grace periods after which memory reclamation is possible. \
 \
Accesses to detect grace periods after which memory reclamation is possible."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT & GPL-3.0-or-later"

PV = "0.15.6"

RPM_NAME = "liburcu8-0.15.6-1.3.aarch64.rpm"
RPM_HASH = "68c96d153d4bc958a33aec53d84e1e42a7034f57ae749f25ae40a689a44a2e9de7e0efb692249333ba4ec8c646556ca16cff92e5145e21ebf3f2ddee60c469ee"

RPROVIDES:${PN} += "liburcu-bp.so.8 \
liburcu-cds.so.8 \
liburcu-common.so.8 \
liburcu-mb.so.8 \
liburcu-memb.so.8 \
liburcu-qsbr.so.8 \
liburcu.so.8 \
liburcu8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
