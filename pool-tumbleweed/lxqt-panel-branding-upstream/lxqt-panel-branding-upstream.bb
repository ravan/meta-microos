SUMMARY = "Upstream branding of lxqt-panel"
DESCRIPTION = "This package provides the upstream look and feel for lxqt-panel."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.1"

RPM_NAME = "lxqt-panel-branding-upstream-2.4.1-1.4.noarch.rpm"
RPM_HASH = "4381f07c1754c31a9044234fdb57338b9d8adce355c857db53f79c0af84a9e0a3bc4698e52cc2d0127fb04fb919ac4599c006360a926eb46e6110ced3a697d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lxqt-panel-branding-upstream \
lxqt-panel-branding \
lxqt-panel-branding-upstream"

RDEPENDS:${PN} += "lxqt-panel"

inherit rpm
