SUMMARY = "Stdio bridge for remote MCP servers"
DESCRIPTION = "fastmcp-remote is FastMCP's standalone stdio bridge for remote MCP servers. \
It lets MCP clients that launch local stdio processes connect to MCP servers \
hosted over Streamable HTTP or SSE, filling the role of the mcp-remote npm \
project. It builds one FastMCP client for the URL it is given and exposes \
that client as a local stdio proxy."
LICENSE = "Apache-2.0"

PV = "3.4.7"

RPM_NAME = "python313-fastmcp-remote-3.4.7-1.1.noarch.rpm"
RPM_HASH = "61fd20a896c755b6bb5a783655157323043f040a6577fdfc9ecaf2192d00351a621862e256c929b5f637c61ffc5415953f461d52e42fe54eab69533068c7d8da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastmcp-remote \
python3.13dist-fastmcp-remote \
python313-fastmcp-remote \
python3dist-fastmcp-remote"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-anyio \
python313-fastmcp-slim \
update-alternatives"

inherit rpm
