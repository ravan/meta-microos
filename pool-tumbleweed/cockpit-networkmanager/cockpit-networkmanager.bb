SUMMARY = "Cockpit user interface for networking, using NetworkManager"
DESCRIPTION = "The Cockpit component for managing networking.  This package uses NetworkManager."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-networkmanager-365-2.1.noarch.rpm"
RPM_HASH = "4a990b6178d26a86eb98a643b53e2aa662e17db60ee70fe1b79d59082670eff6fd2d920f18666a6a9956ac2ac5a6b1ba91462665e3ac7fa85d274e84339e5754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-networkmanager"

RDEPENDS:${PN} += "NetworkManager \
cockpit-bridge \
cockpit-shell"

inherit rpm
