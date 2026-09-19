SUMMARY = "Development files for f2fs"
DESCRIPTION = "This package contains development files for f2fs-tools."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.16.0"

RPM_NAME = "f2fs-tools-devel-1.16.0-2.6.aarch64.rpm"
RPM_HASH = "4df8d64e1e610bc7ce17fa523fc6f5ac2d8a1289ada94502a751e8785e94376e93735a15110538b964cb07e5c9ed06d8d6baa3d90e9fe5e6ec883035a170a6d8"

RPROVIDES:${PN} += "f2fs-tools-devel"

RDEPENDS:${PN} += "libf2fs-format9 \
libf2fs10"

inherit rpm
