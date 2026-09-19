SUMMARY = "Tools for building lxqt"
DESCRIPTION = "This package provides several tools needed to build compatibility for Qt5 applications within LXQt 2.0"
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "lxqt-build-tools-qt5-devel-0.13.0-1.7.noarch.rpm"
RPM_HASH = "df00f4a91f407f90c74e07ef93535d2555f16d000ed09f83ce23576210c123b2e5e1fc75cc3d66d22e688a9942d34053c1170e850a02444724918d5968b96e3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-lxqt-build-tools \
lxqt-build-tools-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
cmake-Qt5Core"

inherit rpm
