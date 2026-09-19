SUMMARY = "Development files for tukit library"
DESCRIPTION = "This package contains the files required to develop programs to do \
transactional updates using btrfs snapshots."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "6.1.3"

RPM_NAME = "libtukit-devel-6.1.3-1.2.aarch64.rpm"
RPM_HASH = "c0f4b6bc98a0bc581bc7cf2733c36e14b78ab32d664240e7e9104827906ae155ba5b4a21f077c5b04ab2f3d4b5163b1656509ff1ff935061183cb8c6b12f37da"

RPROVIDES:${PN} += "libtukit-devel \
pkgconfig-tukit \
tukit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtukit8 \
pkgconfig-libeconf \
pkgconfig-mount \
pkgconfig-rpm"

inherit rpm
