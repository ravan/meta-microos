SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kauth-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "faa062fdd1e9cb21b1d3232ca3acecc63c995a08a75d4496a27b08eeb8b1a7dd0e1e910449f10dca8a590a21abe972c896f4b880c0fe2f58fb3913c41cd01d18"

RPROVIDES:${PN} += "cmake-KF6Auth \
kf6-kauth-devel"

RDEPENDS:${PN} += "cmake-KF6CoreAddons \
libKF6AuthCore6"

inherit rpm
