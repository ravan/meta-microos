SUMMARY = "Base Package for Integrated Development Environments: Build Environment"
DESCRIPTION = "This package contains the development files for building integrated \
developments environments based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdevplatform-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "885c7cd03f3fe1c99bd1c005acca9b8cbcaf92df544fb02ecf0f490235e287bae7ff2239bedea79f807f6067d1f07bb6d86d08fd99aac1ec81177a4ed14576e0"

RPROVIDES:${PN} += "cmake-KDevPlatform \
kdevplatform-devel"

RDEPENDS:${PN} += "cmake-KF6TextEditor \
cmake-KF6ThreadWeaver \
cmake-Qt6Core5Compat \
cmake-Qt6Test \
cmake-Qt6WebEngineWidgets \
libkdevplatform66"

inherit rpm
