SUMMARY = "Python implementation of the Model Context Protocol"
DESCRIPTION = "Model Context Protocol (or Master Control Program?) implementation \
for python."
LICENSE = "MIT"

PV = "1.28.1"

RPM_NAME = "python314-mcp-1.28.1-1.3.noarch.rpm"
RPM_HASH = "aedfa893eff6066f8f7cee91aea8641741c03ab831998f835ca6b1d259c013fc662ccaa88a866fbfc03e9e018118efb1b0cdd313c82d839a0e699df1578e699d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mcp \
python314-mcp \
python3dist-mcp"

RDEPENDS:${PN} += "python-abi \
python314-anyio \
python314-cryptography \
python314-httpx \
python314-httpx-sse \
python314-jsonschema \
python314-pydantic \
python314-pydantic-settings \
python314-python-multipart \
python314-sse-starlette \
python314-starlette \
python314-uvicorn"

inherit rpm
