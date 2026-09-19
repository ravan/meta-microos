SUMMARY = "File compression program"
DESCRIPTION = "Zip is a compression and file packaging utility. It is compatible with \
PKZIP(tm) 2.04g (Phil Katz ZIP) for MS-DOS systems."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "zip-3.0-24.9.aarch64.rpm"
RPM_HASH = "d36c90480aea2ab360ca7e0105fab435ea612437dd0f7c27d277acf2a27acd24f40f0b6820f35d6bbd4920c495143d182916a86c983e33e7438228c17117f5b8"

RPROVIDES:${PN} += "crzip \
zip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6"

inherit rpm
