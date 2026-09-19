SUMMARY = "Package to pull in the latest blender for you"
DESCRIPTION = "This is a wrapper package to pull in the versioned packages of blender. \
 \
This package by defaults pulls in the latest lts version for you."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "blender-lts-5.2.0-1.1.noarch.rpm"
RPM_HASH = "ad207c6c6eb9da3445dfeada272fbc60e1c3c860604b9ae478d0e0b343303f30b6d324ddd6bb17cc38f7c10a2a7a2f9cd81588d39ddf3adb7ee3293e8cbcc2da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender-lts \
blender-wrapper-lts"

RDEPENDS:${PN} += "blender-implementation-lts"

inherit rpm
