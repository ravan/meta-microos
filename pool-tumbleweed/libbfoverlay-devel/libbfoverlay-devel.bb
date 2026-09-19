SUMMARY = "Development files for libbfoverlay"
DESCRIPTION = "libbfoverlay is a library to provide basic file overlay support. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbfoverlay."
LICENSE = "LGPL-3.0-or-later"

PV = "20240505"

RPM_NAME = "libbfoverlay-devel-20240505-2.16.aarch64.rpm"
RPM_HASH = "3b4fff87973baae10bc90f51aa8732986ce72d74c00bb8670b0e65058b48afa814e0d1c9ee61867083a19d192ca8a1823f00f930ae6f0f6ec0e6015be0091803"

RPROVIDES:${PN} += "libbfoverlay-devel \
pkgconfig-libbfoverlay"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libbfoverlay1"

inherit rpm
