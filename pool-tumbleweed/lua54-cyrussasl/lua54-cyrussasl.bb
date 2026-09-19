SUMMARY = "Cyrus SASL library for Lua 5.1+"
DESCRIPTION = "Provides Lua bindings for Cyrus SASL authentication library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "lua54-cyrussasl-1.1.0-5.3.aarch64.rpm"
RPM_HASH = "3a21f0f6e7a9fe7cb4ee05066fd73a4a195f4a6b36278e40a36b81f8609a98f6f5f3530add00839a40178583608d6dde21a0bb94b161f937d75a8fadac62c48b"

RPROVIDES:${PN} += "lua-cyrussasl \
lua54-cyrussasl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsasl2.so.3 \
lua54"

inherit rpm
