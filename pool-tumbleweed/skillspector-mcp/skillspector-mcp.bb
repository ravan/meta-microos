SUMMARY = "MCP server mode for SkillSpector"
DESCRIPTION = "This subpackage enables the Model Context Protocol (MCP) server mode of \
SkillSpector, exposed through the 'skillspector mcp' subcommand. It pulls \
in the optional MCP runtime dependency so the FastMCP-based server can be \
started for local CLI agents or over HTTP."
LICENSE = "Apache-2.0"

PV = "2.11.2"

RPM_NAME = "skillspector-mcp-2.11.2-1.1.noarch.rpm"
RPM_HASH = "0857739ad64f86a4d2770e7ca24f46048558a772e435081cb46cd85e7c64aff6c79bb4fcb31eaec2e6e7952c9ac47d9732f9f363765cdc2b5ac9945b94dde2de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skillspector-mcp"

RDEPENDS:${PN} += "python313-mcp \
skillspector"

inherit rpm
