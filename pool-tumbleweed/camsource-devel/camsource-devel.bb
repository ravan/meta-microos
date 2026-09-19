SUMMARY = "Camsource Grabs Images from a Video4Linux Device"
DESCRIPTION = "Camsource grabs images from a video4linux device (webcam or TV card). \
It is modular and has several plug-ins for modifying the image before \
displaying it via HTTP or FTP upload."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "camsource-devel-0.7.1-5.10.noarch.rpm"
RPM_HASH = "2314c9b37131a98f728c4a706f17fa8f14b7eb91476c38aa581ba68d40f85876a1c80a8cf01d6cd4bb4569e88bb8c79c16d9427c10341cedbc63e497326d7b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "camsource-/usr/include/camsource/image.h \
camsource-devel"

RDEPENDS:${PN} += "camsource"

inherit rpm
