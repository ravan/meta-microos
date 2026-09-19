SUMMARY = "Non-ABI stable API for the Qt 6 Positioning Library"
DESCRIPTION = "This package provides private headers of libQt6Positioning that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-positioning-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5af46e1abe7965675bab99e58e6ff1ab28917820b8849c4746750faa99fe9aa7244607c05c444ce5f7b2d1a74d8b03628d209366513d05ef736bd50e54247a48"

RPROVIDES:${PN} += "cmake-Qt6PositioningPrivate \
qt6-positioning-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Positioning"

inherit rpm
