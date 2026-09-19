SUMMARY = "String handling essentials development files"
DESCRIPTION = "This package provides files required for development with libestr, \
the string handling essentials library used by the rsyslog daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.11"

RPM_NAME = "libestr-devel-0.1.11-1.26.aarch64.rpm"
RPM_HASH = "262e55d6a33f2f4c810b7b6a6e8f55f3aedb24cac085f32f297cf15fa6a28af0bdd11eb35a038315d93d9dbf86d9d8ac845e6d16344661e994f15796323d000c"

RPROVIDES:${PN} += "libestr-devel \
pkgconfig-libestr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libestr0"

inherit rpm
