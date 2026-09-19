SUMMARY = "Utility to create Microsoft .appx packages"
DESCRIPTION = "appx is a tool which creates and optionally signs \
Microsoft Windows APPX packages."
LICENSE = "BSD-3-Clause & MPL-2.0"

PV = "0.5"

RPM_NAME = "appx-util-0.5-1.11.aarch64.rpm"
RPM_HASH = "f688b6685eeb354f46047951324099f087c5c6d27de23d130fd01d4030aa82c227fe28ecba9f5d72f686baffd34ed108706839581032008a488929be830a3743"

RPROVIDES:${PN} += "appx-util \
fb-util-for-appx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
