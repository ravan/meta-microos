SUMMARY = "Static PAPI libraries"
DESCRIPTION = "This package includes the static PAPI libraries."
LICENSE = "BSD-3-Clause"

PV = "7.2.0"

RPM_NAME = "papi-devel-static-7.2.0-1.6.aarch64.rpm"
RPM_HASH = "c5b966164f879d409943c36af80d5a55d05d7ae713fddcb79e3ceb50fba2af66d73e0d8b203d9615c4b9c6913ec423d70ad0383efafaad175add4e2155434326"

RPROVIDES:${PN} += "papi-devel-static"

RDEPENDS:${PN} += "linux-kernel-headers \
papi-devel"

inherit rpm
