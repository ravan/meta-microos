SUMMARY = "Model Context Protocol server for Bugzilla"
DESCRIPTION = "An MCP (Model Context Protocol) server exposing Bugzilla as a set of tools, \
so MCP-capable clients can search, read and act on Bugzilla bugs."
LICENSE = "Apache-2.0"

PV = "0.20.0"

RPM_NAME = "mcp-bugzilla-0.20.0-1.1.noarch.rpm"
RPM_HASH = "d5e243806cecd26332d3d27a151742ddc11de4b04ec20afefd7e4fb6c528ad882df1df77054cc12955eb2c1d52442bd29286a07d9e96385af35f8001d2f2802e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bugzilla-mcp \
mcp-bugzilla \
python3.13dist-mcp-bugzilla \
python313-bugzilla-mcp \
python3dist-mcp-bugzilla"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-fastmcp \
python313-httpx-retries"

inherit rpm
