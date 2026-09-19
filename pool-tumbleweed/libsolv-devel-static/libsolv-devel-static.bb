SUMMARY = "Development files for libsolv, a package solver"
DESCRIPTION = "Development files for libsolv, a library for solving packages and \
reading repositories."
LICENSE = "BSD-3-Clause"

PV = "0.7.39"

RPM_NAME = "libsolv-devel-static-0.7.39-1.4.aarch64.rpm"
RPM_HASH = "19e97f72216526217a693f0b19ade50f3177ab3d8f2832c42583d367cd970496ba3bb73fed5b5dc7e78ae064c90c104a436817908d37498f5c014134f65b09ae"

RPROVIDES:${PN} += "libsolv-devel-static"

RDEPENDS:${PN} += "libsolv-devel"

inherit rpm
