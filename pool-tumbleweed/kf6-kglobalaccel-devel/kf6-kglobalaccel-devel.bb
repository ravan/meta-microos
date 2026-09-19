SUMMARY = "Global desktop keyboard shortcuts: Build Environment"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kglobalaccel-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "459d65a0839d3cdfbcf6e957184357fb66b11043d3f714dcaca58a59454b9515a018b7d4a8151dd0d6d22228738525c16644f96234e838918785b115ce19ddb0"

RPROVIDES:${PN} += "cmake-KF6GlobalAccel \
kf6-kglobalaccel-devel"

RDEPENDS:${PN} += "cmake-Qt6DBus \
cmake-Qt6Widgets \
libKF6GlobalAccel6"

inherit rpm
