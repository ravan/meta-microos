SUMMARY = "KDE Konqueror Libraries: Build Environment"
DESCRIPTION = "Development package for the konqueror libraries."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "konqueror-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b88c57072c62d85327b7860aa88f3d9671a7458ad9f3a381a7750d761a2eebe87ec9f203d38ffdcecf7f2f25ad1b29578586c8d5da5fedd83bf016c687a6ffca"

RPROVIDES:${PN} += "cmake-KF6Konq \
cmake-KF6KonqSettings \
konqueror-devel \
libkonq-devel"

RDEPENDS:${PN} += "konqueror"

inherit rpm
