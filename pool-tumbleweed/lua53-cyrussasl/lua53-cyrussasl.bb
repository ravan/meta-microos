SUMMARY = "Cyrus SASL library for Lua 5.1+"
DESCRIPTION = "Provides Lua bindings for Cyrus SASL authentication library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "lua53-cyrussasl-1.1.0-5.3.aarch64.rpm"
RPM_HASH = "478898f20d99e4cda0ae355e288668a6c1b4a8e2d8ffc72678614021479a71414b681d3dda7831f654a97bd20ea635edc15af737bb8a95b11affd2742cc69e10"

RPROVIDES:${PN} += "lua53-cyrussasl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsasl2.so.3 \
lua53"

inherit rpm
