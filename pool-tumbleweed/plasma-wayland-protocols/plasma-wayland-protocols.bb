SUMMARY = "Wayland protocols used by Plasma"
DESCRIPTION = "This package contains the non-standard Wayland protocol definitions used by \
KDE Plasma."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-2.1-or-later & MIT"

PV = "1.22.0"

RPM_NAME = "plasma-wayland-protocols-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "1204901b94c2de966c5e8de50d33fdad0ea247607ce0b20ec0f11abc87ac7ce8dea12afb9b65303019fdd23ddf1c8cd3fac28b1210d1207ad0256565ec93c735"

RPROVIDES:${PN} += "cmake-PlasmaWaylandProtocols \
plasma-wayland-protocols"

RDEPENDS:${PN} += ""

inherit rpm
