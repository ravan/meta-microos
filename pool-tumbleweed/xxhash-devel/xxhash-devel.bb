SUMMARY = "Headers for xxHash, a non-cryptographic hash algorithm"
DESCRIPTION = "Headers and other development files for xxHash."
LICENSE = "BSD-2-Clause"

PV = "0.8.3"

RPM_NAME = "xxhash-devel-0.8.3-1.8.aarch64.rpm"
RPM_HASH = "4f41bb5a5e8beacca92e5f603c3f49797a7b93a16c7acb2352dd56ce350e4538e496546c3f4aef08f27224ade6705535ff864fca1457f02fe43dfe53dbaf65d6"

RPROVIDES:${PN} += "pkgconfig-libxxhash \
xxhash-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxxhash0 \
xxhash"

inherit rpm
