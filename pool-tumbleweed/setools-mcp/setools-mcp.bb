SUMMARY = "MCP server for SELinux"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis. \
 \
This package includes the following console tools: \
 \
mcp: A model context protocol server providing analysis tools to LLMs."
LICENSE = "GPL-2.0-only"

PV = "4.7.1"

RPM_NAME = "setools-mcp-4.7.1-1.1.aarch64.rpm"
RPM_HASH = "42b9d7d36efc7c49264e7e617fb7646f5c3bc4a8653d02f63c71db7b51b4f4931fd1350db1cc350fc0e997a0d24ca07d7027bc99c028954b6996b2213e459d41"

RPROVIDES:${PN} += "setools-mcp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-fastmcp \
python3-mcp \
python3-setools"

inherit rpm
