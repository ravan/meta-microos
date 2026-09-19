SUMMARY = "Header files for the 5250 Emulator"
DESCRIPTION = "Header files for use with the tn5250 library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.18.0"

RPM_NAME = "tn5250-devel-0.18.0-1.4.aarch64.rpm"
RPM_HASH = "20cce2b93f384e13c00a79d199abc40c753749c984446c89451d79564f3aeaba19c002b93079af94092ce7d2e0bd96e4e5f41b732c3b7640c3cc19eea3d0e244"

RPROVIDES:${PN} += "pkgconfig-tn5250 \
tn5250-/usr/include/tn5250/tn5250d.h \
tn5250-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lib5250-0"

inherit rpm
