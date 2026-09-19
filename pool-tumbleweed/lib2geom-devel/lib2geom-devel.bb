SUMMARY = "Development files for lib2geom"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require lib2geom."
LICENSE = "LGPL-2.1-only & MPL-1.1"

PV = "1.4.0"

RPM_NAME = "lib2geom-devel-1.4.0-3.5.aarch64.rpm"
RPM_HASH = "cdfb7e99b1fef0da909a73dce7f43f58c4b05ba402ccbb829e70340608335be092a93161f5766b2eac07a3829db7da3932662298791d4bb24ab2fb40f98220f5"

RPROVIDES:${PN} += "cmake-2Geom \
lib2geom-devel \
pkgconfig-2geom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lib2geom1-4-0"

inherit rpm
