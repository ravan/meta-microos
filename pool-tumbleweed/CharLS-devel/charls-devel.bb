SUMMARY = "Libraries and headers for CharLS"
DESCRIPTION = "This package contains libraries and headers for CharLS."
LICENSE = "BSD-3-Clause"

PV = "2.4.2"

RPM_NAME = "CharLS-devel-2.4.2-1.11.aarch64.rpm"
RPM_HASH = "8acd7dfe0572caed0757ab3b25200bffab93e7c19b6592015c03a90a93acf1201f94513bfdc87ddad0d0096563efcd2f7ad40ba7712f5d32ca56c7d55e7d3c23"

RPROVIDES:${PN} += "CharLS-devel \
cmake-charls \
pkgconfig-charls"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcharls2"

inherit rpm
