SUMMARY = "Command line client for exploring MCP server tools"
DESCRIPTION = "mcpcurl connects to any Model Context Protocol server over stdio, retrieves the \
tool schema the server advertises and dynamically builds a command line \
interface from it: every tool becomes a subcommand whose flags are validated \
against the schema. \
 \
It is a developer and debugging aid for MCP servers in general and for the \
GitHub MCP server in particular. The tool is self-contained and does not \
require the server package to be installed."
LICENSE = "MIT"

PV = "1.12.1"

RPM_NAME = "github-mcp-server-mcpcurl-1.12.1-1.1.aarch64.rpm"
RPM_HASH = "d1908720cc1c504c951361d20aad1d1ee70775ae0da0ad77702121eea0fd1bc035b343d162b4ff06416c39a52bcd0ddc5a1f2ef123ffdd083308f97c34d4b14c"

RPROVIDES:${PN} += "github-mcp-server-mcpcurl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
