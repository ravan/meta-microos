SUMMARY = "Package to pull in the latest blender for you"
DESCRIPTION = "This is a wrapper package to pull in the versioned packages of blender. \
 \
This package by defaulang pulls in the latest lang version for you."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "blender-lang-5.2.0-1.1.noarch.rpm"
RPM_HASH = "3d917c142fd03fc993ab24cd78bad76a980d176a113fbfc735b4f804cc67c11239a6069f05a9a1939ce60c202e29f1c553de5196ea6dd3808a3e5906bb9b652f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender-lang \
blender-wrapper-lang"

RDEPENDS:${PN} += ""

inherit rpm
