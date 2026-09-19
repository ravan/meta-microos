SUMMARY = "Development files of molequeue"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use molequeue."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "molequeue-devel-0.9.0-4.3.aarch64.rpm"
RPM_HASH = "8d1c4c8804656a1a62dc40e0f0fbfa785c0b6a9ca124ad9470d624fdc70f2466427bd87cdd560c98956809aeb70aaa4a38ada018b9c8bfcab40fda2edebd84b6"

RPROVIDES:${PN} += "cmake-MoleQueue \
molequeue-devel"

RDEPENDS:${PN} += "libqt5-qtbase-devel \
molequeue-libs0"

inherit rpm
