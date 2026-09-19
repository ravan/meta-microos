SUMMARY = "An interactive TUI S.M.A.R.T viewer"
DESCRIPTION = "CrazyDiskInfo is an interactive TUI S.M.A.R.T viewer. \
It offers the following features: \
 \
 * An UI similar to CrystalDiskInfo. \
 * Health and temperature checking algorithms based on CrystalDiskInfo."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "crazydiskinfo-1.1.0-2.9.aarch64.rpm"
RPM_HASH = "41c29f4a83f7fed5df27d9a8683c11ebfe1d7bbe03b7322b14cae218a9c1ec24ab7baf29fe4f63961a394f3f721f278bca08ad5ca683b62d4224ff075d092e06"

RPROVIDES:${PN} += "crazydiskinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatasmart.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
