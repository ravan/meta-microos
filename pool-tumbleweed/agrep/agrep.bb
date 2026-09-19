SUMMARY = "Another grep with approximate matching and block search"
DESCRIPTION = "agrep is a grep utility which has the ability to search for \
approximate patterns as well as block oriented search."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "agrep-0.9.0-1.8.aarch64.rpm"
RPM_HASH = "abc44595ef0b4ca08b66431b3d5e1f997a9f078b482f1b7cc481833a21366eab2fb55f147e6a4d384c5cdc19554ad1d740edd952f79b42492705e24127c18bd9"

RPROVIDES:${PN} += "agrep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtre.so.5"

inherit rpm
