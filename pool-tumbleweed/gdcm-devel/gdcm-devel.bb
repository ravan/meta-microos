SUMMARY = "Libraries and headers for GDCM"
DESCRIPTION = "Header files needed for developing applications that want to make use \
of GDCM."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "gdcm-devel-3.2.5-2.3.aarch64.rpm"
RPM_HASH = "d1bf42859c8d823520539798ec2d7bd54975dfff7e3766c9e5fd282bf5012e8641cf8b256bf7019f6e2e687b592efa10c271a9a4b56bcbbd0e9d9e05cdcc9953"

RPROVIDES:${PN} += "cmake-GDCM \
gdcm-devel"

RDEPENDS:${PN} += "gdcm-applications \
libgdcm3-2 \
libsocketxx1-2"

inherit rpm
