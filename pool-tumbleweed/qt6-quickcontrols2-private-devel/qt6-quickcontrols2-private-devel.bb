SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2 that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickcontrols2-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "ab18cf071f37b47433a869ac53553df2c1681621fd8dd11d7238940dab947941700e0db889cc97c01a0c04ef6edcb5e61532e3ffc5432755df0ea19c18b1bd06"

RPROVIDES:${PN} += "cmake-Qt6QuickControls2Basic \
cmake-Qt6QuickControls2BasicPrivate \
cmake-Qt6QuickControls2Fusion \
cmake-Qt6QuickControls2FusionPrivate \
cmake-Qt6QuickControls2Imagine \
cmake-Qt6QuickControls2ImaginePrivate \
cmake-Qt6QuickControls2Material \
cmake-Qt6QuickControls2MaterialPrivate \
cmake-Qt6QuickControls2Private \
cmake-Qt6QuickControls2Universal \
cmake-Qt6QuickControls2UniversalPrivate \
pkgconfig-Qt6QuickControls2Basic \
pkgconfig-Qt6QuickControls2Fusion \
pkgconfig-Qt6QuickControls2Imagine \
pkgconfig-Qt6QuickControls2Material \
pkgconfig-Qt6QuickControls2Universal \
qt6-quickcontrols2-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6QuickControls2"

inherit rpm
