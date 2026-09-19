SUMMARY = "The bzip2 runtime library development files"
DESCRIPTION = "The bzip2 runtime library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "libbz2-devel-1.0.8-6.1.aarch64.rpm"
RPM_HASH = "8fbec34b9c9ee7e07b47c5fa4b48a569386d8cd7c5d5255ba3eb1c6e34fb008d9ff6439374fd52a633eea915b0cd43e4c48ff35a0ba7fb725c0989dfff6c0cb7"

RPROVIDES:${PN} += "libbz2-devel \
pkgconfig-bzip2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libbz2-1"

inherit rpm
