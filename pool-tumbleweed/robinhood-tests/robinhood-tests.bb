SUMMARY = "Internal tests for robinhood"
DESCRIPTION = "Tests and examples for the robinhood policy engine."
LICENSE = "CECILL-C"

PV = "3.2.0"

RPM_NAME = "robinhood-tests-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "1a1099f9d9c82bb67b1d240ca945ff283b417794a3b11e4391cceacfa302d3dd910a6520ae6bffdfdb6c199e20134f1f24da62fa49424905a22aaabb5ab5a290"

RPROVIDES:${PN} += "robinhood-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
