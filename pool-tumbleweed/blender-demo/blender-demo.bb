SUMMARY = "Package to pull in the latest blender for you"
DESCRIPTION = "This is a wrapper package to pull in the versioned packages of blender. \
 \
This package by defaudemo pulls in the latest demo version for you."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "blender-demo-5.2.0-1.1.noarch.rpm"
RPM_HASH = "158e494b04a993ef6b840f9a28d477284e262e0ebce19445fb4e7c146e704cfc6d169d5c973755f47a4bcde30ace9b042ec9ac196c5dd80a2108d6d477a12515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender-demo \
blender-wrapper-demo"

RDEPENDS:${PN} += ""

inherit rpm
