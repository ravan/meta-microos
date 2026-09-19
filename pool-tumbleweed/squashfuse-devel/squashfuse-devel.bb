SUMMARY = "FUSE module to mount squashfs images"
DESCRIPTION = "Squashfuse is a FUSE filesystem that allows a \
squashfs archive to be mounted in user-space. \
It is designed to be fast and memory-efficient, \
and supports most of the features of the squashfs format. \
 \
This package contains development files."
LICENSE = "BSD-2-Clause"

PV = "0.6.1"

RPM_NAME = "squashfuse-devel-0.6.1-1.7.aarch64.rpm"
RPM_HASH = "ad34ca6b47f53fad4529a195f953d31c0a70d870b5124f7df6dd883b9b3981ae33cc84efee29fcc5f9df5d0399b41df82a1f39e6bf455ec23d933f419edfa5ac"

RPROVIDES:${PN} += "pkgconfig-squashfuse \
pkgconfig-squashfuse-ll \
squashfuse-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsquashfuse0"

inherit rpm
