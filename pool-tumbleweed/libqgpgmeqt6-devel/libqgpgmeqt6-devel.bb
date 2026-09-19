SUMMARY = "Development files for qgpgme (Qt6)"
DESCRIPTION = "QGpgme provides a very high level Qt API around GpgMEpp. \
 \
This package contains the files needed to build using qgpgme and Qt6."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "libqgpgmeqt6-devel-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "8cb178627d2628fcba83f65ff43e21876d07b25f43a71c0fa23e122bf1633e214a9ae0f8b4eaf7fe7625aed248ae0b966e733de48f186f82212f2931a25afa04"

RPROVIDES:${PN} += "cmake-QGpgmeQt6 \
libqgpgmeqt6-devel"

RDEPENDS:${PN} += "cmake-Gpgmepp \
libqgpgmeqt6-15"

inherit rpm
