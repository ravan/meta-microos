SUMMARY = "MCP server for suseconnect"
DESCRIPTION = "This package provides an MCP server for suseconnect to enable integration into the agentic SLES framework."
LICENSE = "LGPL-3.0-or-later"

PV = "1.23.0"

RPM_NAME = "mcp-server-suseconnect-1.23.0-1.1.aarch64.rpm"
RPM_HASH = "484db449e66eea104fc629f048af8eb8ca3bae54f2ac938357756b261c42d7df32bb802543f571abeb76a032d0a72c290cd5bfc3ec7c3f603e20610ae0ba3b39"

RPROVIDES:${PN} += "mcp-server-suseconnect"

RDEPENDS:${PN} += "libc.so.6 \
suseconnect-ng"

inherit rpm
