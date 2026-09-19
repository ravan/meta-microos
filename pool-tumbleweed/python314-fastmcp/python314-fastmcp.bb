SUMMARY = "The fast, Pythonic way to build MCP servers and clients"
DESCRIPTION = "FastMCP is the fast, Pythonic way to build Model Context Protocol (MCP) \
servers and clients. This is the full distribution, pulling in fastmcp-slim \
with the client and server integrations enabled; the importable 'fastmcp' \
module is provided by fastmcp-slim."
LICENSE = "Apache-2.0"

PV = "3.4.7"

RPM_NAME = "python314-fastmcp-3.4.7-1.1.noarch.rpm"
RPM_HASH = "4505d2d54a18a56fe52088014dee9a6b28dc0f978dc55d229f4ef5f17eac3e22c5f12a0b0e46d656b794f14e09aafa88f3760f24af4051a77ada2d0f7a0ca159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fastmcp \
python314-fastmcp \
python3dist-fastmcp"

RDEPENDS:${PN} += "python314-fastmcp-slim"

inherit rpm
