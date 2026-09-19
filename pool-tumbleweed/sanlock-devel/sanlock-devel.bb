SUMMARY = "Development files for sanlock"
DESCRIPTION = "The sanlock-devel package contains libraries and header files for \
developing applications that use sanlock."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "sanlock-devel-5.1.0-2.3.aarch64.rpm"
RPM_HASH = "25c6cd69fc2bbfce5d49b1e2ad429a94ef0930c0d0fb212b33e67c40577d214b86a416ded25f21cc6dc16c7f01901eb1df56fe39578cddcdb1e5487428b67b80"

RPROVIDES:${PN} += "pkgconfig-libsanlock \
pkgconfig-libsanlock-client \
sanlock-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsanlock1"

inherit rpm
