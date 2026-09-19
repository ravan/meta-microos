SUMMARY = "Model Context Protocol server for Redmine"
DESCRIPTION = "An MCP (Model Context Protocol) server exposing a Redmine instance as a set \
of tools, so MCP-capable clients can search, read and act on Redmine issues, \
projects, wikis and time entries through Redmine's REST API."
LICENSE = "MPL-2.0"

PV = "2026.9.10.84818"

RPM_NAME = "mcp-redmine-2026.9.10.84818-1.1.noarch.rpm"
RPM_HASH = "e5562500c057b1c32071cbf643bfaef04a5b9af796f1a72ef52251a53eb7a0f34e2ad0ae4417e20dc88134d57e761ab499a94f8f0d61cec5b798db5acd631eab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mcp-redmine \
python3.13dist-mcp-redmine \
python3dist-mcp-redmine \
redmine-mcp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-PyYAML \
python313-httpx \
python313-mcp \
python313-openapi-core"

inherit rpm
