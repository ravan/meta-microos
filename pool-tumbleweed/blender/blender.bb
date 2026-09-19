SUMMARY = "Package to pull in the latest blender for you"
DESCRIPTION = "This is a wrapper package to pull in the versioned packages of blender. \
 \
This package by defaults pulls in the latest version for you."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "blender-5.2.0-1.1.noarch.rpm"
RPM_HASH = "84524261e5d41fc54baa175b062b265dff3ab775155cb60fe39cb8aea86f856dc6b8e44700c92c90bb772514b290ffaec4331c991645c79ec8ff153380d90980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender \
blender-wrapper"

RDEPENDS:${PN} += "blender-implementation"

inherit rpm
