SUMMARY = "Development libraries and header files for dc1394"
DESCRIPTION = "This package contains the header files and libraries for building \
programs using the dc1394 library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.7"

RPM_NAME = "libdc1394-devel-2.2.7-2.9.aarch64.rpm"
RPM_HASH = "00b7e1146804f8333f56cf8104d4e06c7e98c98041ad3d7860a81615e50ab519df1366b8d6e52854f59aea14d20f05b62fcae9dff947973a32a52acc52c7ceef"

RPROVIDES:${PN} += "libdc1394-devel \
pkgconfig-libdc1394-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdc1394-26 \
libdc1394-tools \
pkgconfig-libraw1394"

inherit rpm
