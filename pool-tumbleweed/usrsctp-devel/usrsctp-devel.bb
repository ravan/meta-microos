SUMMARY = "Usersctp Development Kit"
DESCRIPTION = "The development files for usersctp."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "usrsctp-devel-0.9.5.0-2.5.aarch64.rpm"
RPM_HASH = "92bea3bcf49ba582f2b71ea76f28549f557454776a6e1b4867c367b6619c41215275e5200cf74a7a30292d4b1b6eb580fbd1112c6c22456c08d7d62957fe3f57"

RPROVIDES:${PN} += "pkgconfig-usrsctp \
usrsctp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusrsctp2"

inherit rpm
