SUMMARY = "Development files for libQgpsmm"
DESCRIPTION = "This package provides headers files for the gpsd Qt5 library."
LICENSE = "BSD-3-Clause"

PV = "3.27.5"

RPM_NAME = "gpsd-qt6-devel-3.27.5-3.2.aarch64.rpm"
RPM_HASH = "58240e74294ba57acc23d52865d0464bfbc75cdad067754c82a3d7bbc38e8d20ead9f3ac2e08d358ff3547096cc8b0df85eef4d688f6b8b3c2ae2c8f36e40608"

RPROVIDES:${PN} += "gpsd-qt6-devel \
pkgconfig-Qgpsmm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gpsd-devel \
libQgpsmm32 \
pkgconfig-Qt6Network"

inherit rpm
