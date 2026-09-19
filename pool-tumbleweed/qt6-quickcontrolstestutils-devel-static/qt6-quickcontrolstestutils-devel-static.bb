SUMMARY = "Qt6 QuickControlsTestUtils static library"
DESCRIPTION = "The Qt6 QuickControlsTestUtils static library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickcontrolstestutils-devel-static-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "b5ca0373e9fe91ef6ac05545813ca2259e765027e3faffa587088d2753d8cb7e3f4c6eaac36b0d03bcf8182eb215bfd90ba4a1441c1a27aa8b9092de0f11ca6d"

RPROVIDES:${PN} += "cmake-Qt6QuickControlsTestUtilsPrivate \
qt6-quickcontrolstestutils-devel-static"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2 \
cmake-Qt6QuickDialogs2QuickImpl \
cmake-Qt6QuickPrivate \
cmake-Qt6QuickTemplates2 \
cmake-Qt6Test \
qt6-quicktestutils-devel-static"

inherit rpm
