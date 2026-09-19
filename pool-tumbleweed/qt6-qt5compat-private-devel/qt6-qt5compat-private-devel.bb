SUMMARY = "Non-ABI stable API for the Qt 6 Qt5 Compat library"
DESCRIPTION = "This package provides private headers of libQt6Core5Compat that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qt5compat-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "1c6caf2910394b17739d4eb5d4337e3c7dacf4e29193ec64dca000e9e8adaff08678186436b24f29b272ec05ce965e9f222b494b8ded27d4b72eb18264f0688c"

RPROVIDES:${PN} += "cmake-Qt6Core5CompatPrivate \
qt6-qt5compat-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core5Compat \
cmake-Qt6CorePrivate"

inherit rpm
