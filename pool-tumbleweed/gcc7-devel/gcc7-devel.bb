SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-devel-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "fbad0ae27e3808170c731d3269449863fb1d2c5155bb1dee0de9f992aa0846e3d200a8118cb5051e947c19fe72624ac1e40b1d2ec56c19c114f05db1cd6792b8"

RPROVIDES:${PN} += "gcc7-devel"

RDEPENDS:${PN} += "gcc7 \
gmp-devel \
libc.so.6 \
mpc-devel"

inherit rpm
