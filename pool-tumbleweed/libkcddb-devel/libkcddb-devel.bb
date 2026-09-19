SUMMARY = "Development files for KDE CDDB library"
DESCRIPTION = "This package includes the development headers for libkcddb."
LICENSE = "GPL-2.0-or-later"

PV = "25.04.3"

RPM_NAME = "libkcddb-devel-25.04.3-15.1.aarch64.rpm"
RPM_HASH = "9e8c7d950998dce8d3f99a964603be286f138dfd3613d117bc5368b76350ea6cc0c039364dccc51b9fc90172b4369ca7df57cb6f258fd5df707b29b559d48a44"

RPROVIDES:${PN} += "cmake-KF5Cddb \
libkcddb-devel \
libkcddb5-devel"

RDEPENDS:${PN} += "libKF5Cddb5"

inherit rpm
