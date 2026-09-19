SUMMARY = "Tools for building lxqt-panel, lxqt-config, libfm-qt"
DESCRIPTION = "This package provides several tools needed to build other components \
maintained by the LXQt project."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-menu-data-devel-2.4.0-1.2.noarch.rpm"
RPM_HASH = "45dcac1ea3df37489c51e72ac8f5e5ea918b592147a501a397bdeab9ebdff68c362fa3056538c1343121ad78789ba155dd1c923c990fae99f490ece6075d710e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-lxqt-menu-data \
lxqt-menu-data-devel"

RDEPENDS:${PN} += "lxqt-menu-data"

inherit rpm
