SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-oxygen-icons-scalable-6.30.0-1.1.noarch.rpm"
RPM_HASH = "aed7ae311f47e50d38eb8acd419b6416bc0675a95125c379b75447df54394dcc98d719b6a30014e07e84a3d5d18fe157cca0d337a17f6cbcf6d2683f2c221166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-oxygen-icons-scalable \
oxygen-icon-theme-scalable \
oxygen5-icon-theme-scalable"

RDEPENDS:${PN} += "/usr/bin/bash \
kf6-oxygen-icons"

inherit rpm
