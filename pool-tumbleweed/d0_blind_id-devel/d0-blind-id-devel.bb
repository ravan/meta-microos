SUMMARY = "Development files for the Blind-ID library"
DESCRIPTION = "Development files for the Blind-ID library for user identification using \
RSA blind signatures"
LICENSE = "BSD-3-Clause"

PV = "0.8.6"

RPM_NAME = "d0_blind_id-devel-0.8.6-1.11.aarch64.rpm"
RPM_HASH = "b8eba25ce99e7a80f20526c1acf93d1a21837c5119c4a38f58b188b99f604895e924ad563acec66b47b10d6020bc6dac2023195a4eb15b88cac5defe5ca766c0"

RPROVIDES:${PN} += "d0-blind-id-devel \
pkgconfig-d0-blind-id \
pkgconfig-d0-rijndael"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libd0-blind-id0 \
libd0-rijndael0"

inherit rpm
