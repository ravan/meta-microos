SUMMARY = "Dummy development package"
DESCRIPTION = "Dummy development package for backwards compatibility."
LICENSE = "LGPL-2.0-only"

PV = "1.47.3"

RPM_NAME = "e2fsprogs-devel-1.47.3-2.2.aarch64.rpm"
RPM_HASH = "b2ff84bd6a36a91ce43429a3d16693629b544101ff384b91774c5a2c5a164d6f74da7b68165dcabc8b9c3ae836d5b80e43b21ab286348a4d3e331b73c8584dec"

RPROVIDES:${PN} += "e2fsprogs-devel"

RDEPENDS:${PN} += "libblkid-devel \
libext2fs-devel \
libuuid-devel"

inherit rpm
