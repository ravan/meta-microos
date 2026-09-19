SUMMARY = "Userspace Read-Copy-Update Library"
DESCRIPTION = "liburcu is a LGPLv2.1 userspace RCU (read-copy-update) library. This data \
synchronization library provides read-side access which scales linearly with \
the number of cores. It does so by allowing multiples copies of a given data \
structure to live at the same time, and by monitoring the data structure \
accesses to detect grace periods after which memory reclamation is possible."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT & GPL-3.0-or-later"

PV = "0.15.6"

RPM_NAME = "liburcu-devel-0.15.6-1.3.aarch64.rpm"
RPM_HASH = "35f0ac5a4ae78fb944f59cfbffa1707f720679d14284d81eda3b1ab5470005160377576c65fd31636c1da9fedf5b023225b1f4ebe907dd665057caf89314b892"

RPROVIDES:${PN} += "liburcu-devel \
pkgconfig-liburcu \
pkgconfig-liburcu-bp \
pkgconfig-liburcu-cds \
pkgconfig-liburcu-mb \
pkgconfig-liburcu-memb \
pkgconfig-liburcu-qsbr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liburcu8"

inherit rpm
