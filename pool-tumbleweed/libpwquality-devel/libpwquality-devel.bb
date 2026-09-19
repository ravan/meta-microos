SUMMARY = "Development files for libpwquality, a library for password quality checking"
DESCRIPTION = "libpwquality is a library for password quality checks and generation \
of random passwords that pass the checks. \
 \
This package provides files needed for development of applications \
using the libpwquality library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "libpwquality-devel-1.4.5-5.9.aarch64.rpm"
RPM_HASH = "2678af5e39066297b7f4669e372347e2df7ba668191630e7d6a7d6438b54612bbd4f117ed76d5bfc5e4f1488772fdab1c9cadf099e7e27914c7a1691adc8c703"

RPROVIDES:${PN} += "libpwquality-devel \
pkgconfig-pwquality"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpwquality1 \
pkgconfig"

inherit rpm
