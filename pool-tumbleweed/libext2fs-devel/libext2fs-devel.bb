SUMMARY = "Development files for libext2fs"
DESCRIPTION = "Development files for libext2fs."
LICENSE = "LGPL-2.0-only"

PV = "1.47.3"

RPM_NAME = "libext2fs-devel-1.47.3-2.2.aarch64.rpm"
RPM_HASH = "a870daf12d3d698f9f48c6259fbb7d7eac13610dad72e7dacf8e3de7a3b7b094949e99cc0718d41f88b918924a3a76ba7e6fc66487378c1b7b81bb320c6cc29a"

RPROVIDES:${PN} += "libext2fs-devel \
pkgconfig-e2p \
pkgconfig-ext2fs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcom-err-devel \
libext2fs2 \
pkgconfig-com-err"

inherit rpm
