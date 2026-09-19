SUMMARY = "Non-ABI stable API for the Qt 6 LabsSettings library"
DESCRIPTION = "Development files for the Qt 6 LabsSettings library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-labssettings-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "b1e144b784782cd6d8aeac9feae75e49c18ffaae2e8bca6387e9eb048e79c719a6155539fb1e785c71d9bfda9454f20c13b326c12ed034ae5721266cd19973d0"

RPROVIDES:${PN} += "cmake-Qt6LabsSettings \
cmake-Qt6LabsSettingsPrivate \
pkgconfig-Qt6LabsSettings \
qt6-labssettings-devel \
qt6-labssettings-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Qml \
libQt6LabsSettings6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
