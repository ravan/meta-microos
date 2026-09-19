SUMMARY = "MCP server for package management"
DESCRIPTION = "a server that exposes OS software management functions through the Model \
Context Protocol (MCP). It allows you to manage packages, repositories, and \
patches on a Linux system. Most of the functions are only available on zypper \
and dnf based systems"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "mcp-server-managesw-0.2.1-1.2.aarch64.rpm"
RPM_HASH = "d1775ea206af64428580df23f14ee8316e2519f7bb6199e70eb083150520611e7705a2a1621e5569f6e140874005bafd51d842eb1c2c791c4fa57755e33dc7e6"

RPROVIDES:${PN} += "mcp-server-managesw"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
