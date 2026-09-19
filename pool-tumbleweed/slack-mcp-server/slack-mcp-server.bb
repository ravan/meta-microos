SUMMARY = "Model Context Protocol server for Slack"
DESCRIPTION = "A Model Context Protocol (MCP) server for Slack. It exposes Slack conversations, \
channel and user directories, message history and search to MCP capable AI \
clients and editors, over the stdio and server-sent-events transports. \
 \
It authenticates either with the browser session tokens of an existing Slack \
login or with an OAuth user token, so it needs no workspace app installation and \
no administrator approval. Slack Enterprise and GovSlack workspaces, direct \
messages and group direct messages are supported."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "slack-mcp-server-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "16c53ebde5b8fc353e2ed9043f292608c4a757786254a7577917135aaa3a4059e05fc7c2889a82fa3704979379f8927ba4a7bcf7a531350902613ddb9594b5f8"

RPROVIDES:${PN} += "slack-mcp-server"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
