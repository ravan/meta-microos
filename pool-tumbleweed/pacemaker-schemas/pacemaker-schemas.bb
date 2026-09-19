SUMMARY = "Schemas and upgrade stylesheets for Pacemaker"
DESCRIPTION = "Schemas and upgrade stylesheets for Pacemaker \
 \
Pacemaker is an advanced, scalable High-Availability cluster resource \
manager"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.3+20260728.7052efa194"

RPM_NAME = "pacemaker-schemas-3.0.3+20260728.7052efa194-1.1.noarch.rpm"
RPM_HASH = "18719980d15c77bbddcef2e56bf2fd778e1609965c7c3abf63d1e6801035391ed427506fbc7fb96e21f82d6c2395b82ace3325a6a9a219ca9e618f35f2d39caf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pacemaker-schemas \
pkgconfig-pacemaker-schemas"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
