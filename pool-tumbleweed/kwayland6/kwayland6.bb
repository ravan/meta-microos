SUMMARY = "KDE Wayland library"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "kwayland6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "1c66b77ae7db10f4f3c6466d0d51cdd3a5817831f9e56c33a9d69db0c89fc9b807efed50cb19824efffd9634f01e16c39de66beed52eaf37247ab9e3aa9582cb"

RPROVIDES:${PN} += "kwayland6"

RDEPENDS:${PN} += ""

inherit rpm
