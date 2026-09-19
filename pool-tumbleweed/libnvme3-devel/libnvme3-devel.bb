SUMMARY = "Development files for libnvme"
DESCRIPTION = "The nvme-cli-devel package contains libraries and header files for \
developing applications that use nvme-cli."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0+6.g1ac60ca4b"

RPM_NAME = "libnvme3-devel-3.0+6.g1ac60ca4b-1.1.aarch64.rpm"
RPM_HASH = "b436fc6dbb2ba7b623ed8dcab7a8e38e18b3a3202fd627fea6701c9cb7290ac75659317c7f733bcf7d1bca0daf4be7a7720c434ed1fc6be4029bf7edb682ebce"

RPROVIDES:${PN} += "libnvme3-devel \
pkgconfig-libnvme3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnvme3-1 \
pkgconfig-libkeyutils \
pkgconfig-openssl"

inherit rpm
