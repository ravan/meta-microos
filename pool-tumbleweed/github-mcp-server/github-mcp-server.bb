SUMMARY = "Model Context Protocol server for GitHub"
DESCRIPTION = "GitHub's official Model Context Protocol (MCP) server. It exposes the GitHub \
API - repositories, issues, pull requests, Actions, code scanning, discussions \
and more - as MCP tools, so MCP capable AI clients and editors can query and \
act on GitHub on the user's behalf. \
 \
The server speaks both the stdio transport and streamable HTTP, groups its \
tools into toolsets that can be enabled individually, and supports a read-only \
mode. \
 \
Authenticate with a GitHub personal access token. Note that this build carries \
no built-in OAuth client credentials - those belong to upstream's own published \
binaries and are not part of the source - so the zero configuration OAuth login \
described in some of the upstream documentation is unavailable here. Use a \
personal access token, GitHub App credentials, or pass your own OAuth client id \
via --oauth-client-id."
LICENSE = "MIT"

PV = "1.12.1"

RPM_NAME = "github-mcp-server-1.12.1-1.1.aarch64.rpm"
RPM_HASH = "a0c8beaac14fba24de88401a70af6fd153cbfd4881267856d0a67726c2e2a388549a3120b774ce54fc159908fbd0486b05ec1c1fbe0f1db8d09f1d646f3cba1d"

RPROVIDES:${PN} += "github-mcp-server"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
