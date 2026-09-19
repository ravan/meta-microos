SUMMARY = "MCP Server for Snapper"
DESCRIPTION = "An MCP server for Snapper."
LICENSE = "MIT & BSD-2-Clause & BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "mcp-server-snapper-0.3.0-1.1.aarch64.rpm"
RPM_HASH = "e02028850a8d90eb3501fd12f75a071c77436481f657a3de9a9d9801af2d9f8162b424d80b9f7d4f52fbe4f2bf7cb0825c7799e2e46adeac7e5141b9dad6a6a2"

RPROVIDES:${PN} += "mcp-server-snapper"

RDEPENDS:${PN} += "libc.so.6 \
snapper"

inherit rpm
