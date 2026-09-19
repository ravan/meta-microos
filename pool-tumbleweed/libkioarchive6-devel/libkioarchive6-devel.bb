SUMMARY = "Development package for libkioarchive6"
DESCRIPTION = "This is the development package for libkioarchive6"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkioarchive6-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "03c21459e5fecc33640c5527582d92fbec2ba791951148e5ae2abd8c3d80a8f1a8d8590a299d2bbe2d5d28a9bb5397f25d2053e370324b5f7c0b9ea323ef9134"

RPROVIDES:${PN} += "cmake-KioArchive6 \
libkioarchive6-devel"

RDEPENDS:${PN} += "libkioarchive6-6"

inherit rpm
