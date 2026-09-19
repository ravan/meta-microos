SUMMARY = "Stdio bridge for remote MCP servers"
DESCRIPTION = "fastmcp-remote is FastMCP's standalone stdio bridge for remote MCP servers. \
It lets MCP clients that launch local stdio processes connect to MCP servers \
hosted over Streamable HTTP or SSE, filling the role of the mcp-remote npm \
project. It builds one FastMCP client for the URL it is given and exposes \
that client as a local stdio proxy."
LICENSE = "Apache-2.0"

PV = "3.4.7"

RPM_NAME = "python314-fastmcp-remote-3.4.7-1.1.noarch.rpm"
RPM_HASH = "60da6908e41f0d75054a1c82406847858231912bf812b2d79926c0938e0a1ab316d8c8f3a554c09a728c056bbaff844dc354d20f583b068a3e1cce19e172b179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fastmcp-remote \
python314-fastmcp-remote \
python3dist-fastmcp-remote"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-anyio \
python314-fastmcp-slim \
update-alternatives"

inherit rpm
