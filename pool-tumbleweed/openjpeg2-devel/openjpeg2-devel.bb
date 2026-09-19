SUMMARY = "Development files for openjpeg2"
DESCRIPTION = "The OpenJPEG library is an open-source JPEG 2000 codec written in C language. \
It has been developed in order to promote the use of JPEG 2000, the new \
still-image compression standard from the Joint Photographic Experts Group \
(JPEG). \
 \
This package provides the development files for openjpeg2."
LICENSE = "BSD-2-Clause"

PV = "2.5.4"

RPM_NAME = "openjpeg2-devel-2.5.4-2.6.aarch64.rpm"
RPM_HASH = "8dc6b4642720c46f2883752f0960b43c3b7dec72511c20ea8ed80001dedddb7664da0c92832ef99df32d80974a73b928935e27f56ebf90bbe1e22857d5fba209"

RPROVIDES:${PN} += "cmake-OpenJPEG \
openjpeg2-devel \
pkgconfig-libopenjp2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenjp2-7 \
openjpeg2"

inherit rpm
