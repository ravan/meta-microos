SUMMARY = "Cyrus SASL library for Lua 5.1+"
DESCRIPTION = "Provides Lua bindings for Cyrus SASL authentication library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "luajit-cyrussasl-1.1.0-5.3.aarch64.rpm"
RPM_HASH = "81fe848085ecc1a3588a75bda62bd6bff512986f758d64937e7f78ad4568f9f4ce35b61bbc7c6af25f9af11f0a904f2d84d7c023b20ad30febf6bb474d545e27"

RPROVIDES:${PN} += "luajit-cyrussasl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsasl2.so.3 \
luajit"

inherit rpm
