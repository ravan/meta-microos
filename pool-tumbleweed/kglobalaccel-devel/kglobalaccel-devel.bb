SUMMARY = "Global desktop keyboard shortcuts: Build Environment"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kglobalaccel-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "ff77958db08b3d1b4dd0abbf6c3f9dfc9649669c1762c33dbfa870c205bba78bf2aa0d7b5c32d28f264a5439290e6b59df51017387ebf386058eac7621db58c0"

RPROVIDES:${PN} += "cmake-KF5GlobalAccel \
kglobalaccel-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
cmake-Qt5Widgets \
libKF5GlobalAccel5 \
libKF5GlobalAccelPrivate5"

inherit rpm
