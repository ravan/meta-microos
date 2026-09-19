SUMMARY = "Library for checking installation or Live media"
DESCRIPTION = "Library for checking installation or Live media. Used by checkmedia and linuxrc."
LICENSE = "GPL-3.0-or-later"

PV = "7.1"

RPM_NAME = "libmediacheck-devel-7.1-1.3.aarch64.rpm"
RPM_HASH = "ebea1231d71cce1ba7915b13163d0ae23a41f6bfc1d2be9fc361a240550ef089ecc902625f66c9d95c4c4300f13e2c3844d4a69072acbedef3f66c07bf1f76e2"

RPROVIDES:${PN} += "libmediacheck-devel"

RDEPENDS:${PN} += "libmediacheck7"

inherit rpm
