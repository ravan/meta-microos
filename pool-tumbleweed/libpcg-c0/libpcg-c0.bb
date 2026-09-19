SUMMARY = "Library implementing the PCG random number generation scheme"
DESCRIPTION = "PCG-C implements the PCG random number generation scheme. PCG \
generators are statistically well-distributed, but trade \
cryptographical strength for faster turnaround, and small state. \
PCG-C supports multiple output sizes (8 through 128-bit) and multiple \
independent streams. \
 \
This package contains the shared library for pcg-c."
LICENSE = "Apache-2.0 | MIT"

PV = "0.94.2"

RPM_NAME = "libpcg-c0-0.94.2-1.3.aarch64.rpm"
RPM_HASH = "ee381bddc0773a6cee8adec11b2bdbe2f708b026a60c5a66c4baed41aba289f74fdf3a0de337de34897016d82a6f65b70e248c015867f5f813c3c14989e35501"

RPROVIDES:${PN} += "libpcg-c.so.0 \
libpcg-c0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
