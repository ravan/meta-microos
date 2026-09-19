SUMMARY = "Development files for libcmis"
DESCRIPTION = "Development files for libcmis. libcmis is a C++ client library for \
the CMIS interface."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "libcmis-devel-0.6.2-3.16.aarch64.rpm"
RPM_HASH = "66ec2ec91e55f65702f7e5e956eff98aa6463c42851dac806f1b75037294605a23fed2bd91f7527444383e0031e735147c2d0c74890bb8ccb9d0b0ab23c2986b"

RPROVIDES:${PN} += "libcmis-devel \
pkgconfig-libcmis-0.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcmis-0-6-6 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0"

inherit rpm
