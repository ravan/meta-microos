SUMMARY = "The fast, Pythonic way to build MCP servers and clients (slim)"
DESCRIPTION = "FastMCP is the fast, Pythonic way to build Model Context Protocol (MCP) \
servers and clients. This 'slim' distribution provides the importable \
'fastmcp' module and the fastmcp command, with the full client and server \
stack and the standard set of optional integrations enabled."
LICENSE = "Apache-2.0"

PV = "3.4.7"

RPM_NAME = "python314-fastmcp-slim-3.4.7-1.1.noarch.rpm"
RPM_HASH = "35b2d85bcd1ee2e47252526f82fa96103cd48b0cd69627df3a44e5efaf1a9137421d3063d79c8192691744c6f9bca6320493c95090cfdc7bff30c44726b44048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fastmcp-slim \
python314-fastmcp-slim \
python3dist-fastmcp-slim"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Authlib \
python314-PyYAML \
python314-cyclopts \
python314-email-validator \
python314-exceptiongroup \
python314-griffelib \
python314-httpx \
python314-joserfc \
python314-jsonref \
python314-jsonschema-path \
python314-mcp \
python314-openapi-pydantic \
python314-opentelemetry-api \
python314-packaging \
python314-platformdirs \
python314-py-key-value-aio \
python314-pydantic \
python314-pydantic-settings \
python314-pyperclip \
python314-python-dotenv \
python314-python-multipart \
python314-rich \
python314-starlette \
python314-typing-extensions \
python314-uncalled-for \
python314-uvicorn \
python314-watchfiles \
python314-websockets \
update-alternatives"

inherit rpm
