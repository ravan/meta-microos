SUMMARY = "Development headers for libalternatives"
DESCRIPTION = "This package contains development headers and library for libalternatives."
LICENSE = "Apache-2.0"

PV = "2.0+0.4f22c01"

RPM_NAME = "libalternatives-devel-2.0+0.4f22c01-1.1.aarch64.rpm"
RPM_HASH = "e8b578249e196a7742453b6788fba580c612b8e59f47a909cb793b447ea0a42ac83d1dfa1b621dceaec9e61cc1673caf842361766ac042e7e0ebff8e3c5b7e00"

RPROVIDES:${PN} += "cmake-libalternatives \
libalternatives-devel \
pkgconfig-libalternatives"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libalternatives1"

inherit rpm
