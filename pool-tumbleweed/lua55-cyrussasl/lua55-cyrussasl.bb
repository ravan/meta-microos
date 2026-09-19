SUMMARY = "Cyrus SASL library for Lua 5.1+"
DESCRIPTION = "Provides Lua bindings for Cyrus SASL authentication library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "lua55-cyrussasl-1.1.0-5.3.aarch64.rpm"
RPM_HASH = "5b37a7ff71cf1df236b7cabcdb021dbf3b41afbe4d157ed25893e6cfbcdb8d08b2c0723463d2995969e12efbba95325543390965b8a9c00f09f9a219090adbd7"

RPROVIDES:${PN} += "lua55-cyrussasl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsasl2.so.3 \
lua55"

inherit rpm
