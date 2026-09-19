SUMMARY = "Plugin framework for desktop services: Build Environment"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kservice-devel-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "37dc7f7909e63efc3a0c1421458ebed27dda8a5cb65bffdba56bb9167afae244cc2e4e4b04a014c59d60d687c900d6f07c7e08bbdad948cb60920dd39789e396"

RPROVIDES:${PN} += "cmake-KF5Service \
kservice-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5CoreAddons \
kservice"

inherit rpm
