SUMMARY = "Lua Language Server coded by Lua"
DESCRIPTION = "This package provides a Language Server Protocol (LSP) implementation for Lua."
LICENSE = "MIT"

PV = "3.18.2"

RPM_NAME = "lua-language-server-3.18.2-1.2.aarch64.rpm"
RPM_HASH = "96848b3af42f5a6aea63b2b2d7c04fee5c55cf925ecd8cb2471baf6feb1854cf75dc609344ffe0ec551c6c33134e054ac5b88d5f5fd66ad2555b6a0fed6ae69b"

RPROVIDES:${PN} += "lua-language-server"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
