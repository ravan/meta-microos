SUMMARY = "For Distributed Compile in the Network"
DESCRIPTION = "icecream is the next generation distcc."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "libicecream-devel-1.4.0-4.6.aarch64.rpm"
RPM_HASH = "c44053f2c8c7fb860fd629f05bcbb8ea49122f10a9e5ec2bd4550ace588a4d6504270e416e2055b17de8c589173b434e69b4ed001670614207e0fc74445b97cd"

RPROVIDES:${PN} += "libicecream-devel \
pkgconfig-icecc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libarchive-devel \
libcap-ng-devel \
libstdc++-devel \
libzstd-devel \
lzo-devel"

inherit rpm
