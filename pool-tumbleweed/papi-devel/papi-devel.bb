SUMMARY = "Software Development Kit for PAPI"
DESCRIPTION = "This package includes the C header files that specify the PAPI userspace \
libraries and interfaces. This is required for rebuilding any program \
that uses PAPI."
LICENSE = "BSD-3-Clause"

PV = "7.2.0"

RPM_NAME = "papi-devel-7.2.0-1.6.aarch64.rpm"
RPM_HASH = "c46a6e7f3959271a0c808e6d7efaebc603d475edea0000ac77d206fa8a27c1c5677dcefd13fd74e9af1ac2ac87d1f300ff07ce3024cd870ba080a49fb2a1fc78"

RPROVIDES:${PN} += "papi-devel \
pkgconfig-papi \
pkgconfig-papi-7.2 \
pkgconfig-papi-7.2.0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpapi \
linux-kernel-headers \
papi"

inherit rpm
