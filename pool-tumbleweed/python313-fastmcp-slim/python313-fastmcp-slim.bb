SUMMARY = "The fast, Pythonic way to build MCP servers and clients (slim)"
DESCRIPTION = "FastMCP is the fast, Pythonic way to build Model Context Protocol (MCP) \
servers and clients. This 'slim' distribution provides the importable \
'fastmcp' module and the fastmcp command, with the full client and server \
stack and the standard set of optional integrations enabled."
LICENSE = "Apache-2.0"

PV = "3.4.7"

RPM_NAME = "python313-fastmcp-slim-3.4.7-1.1.noarch.rpm"
RPM_HASH = "07c2b1ab61c1d4ee930832052900bf8d2b3252da9b51ebfca7f15ba9136ccf57a95bbea7fe113b58595b329dc98478c4430edbef03a13620fa2102edd030c3f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastmcp-slim \
python3.13dist-fastmcp-slim \
python313-fastmcp-slim \
python3dist-fastmcp-slim"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Authlib \
python313-PyYAML \
python313-cyclopts \
python313-email-validator \
python313-exceptiongroup \
python313-griffelib \
python313-httpx \
python313-joserfc \
python313-jsonref \
python313-jsonschema-path \
python313-mcp \
python313-openapi-pydantic \
python313-opentelemetry-api \
python313-packaging \
python313-platformdirs \
python313-py-key-value-aio \
python313-pydantic \
python313-pydantic-settings \
python313-pyperclip \
python313-python-dotenv \
python313-python-multipart \
python313-rich \
python313-starlette \
python313-typing-extensions \
python313-uncalled-for \
python313-uvicorn \
python313-watchfiles \
python313-websockets \
update-alternatives"

inherit rpm
