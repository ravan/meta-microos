SUMMARY = "Python implementation of the Model Context Protocol"
DESCRIPTION = "Model Context Protocol (or Master Control Program?) implementation \
for python."
LICENSE = "MIT"

PV = "1.28.1"

RPM_NAME = "python313-mcp-1.28.1-1.3.noarch.rpm"
RPM_HASH = "0883b96f017e112ca360e563a59b02bcae5fc0a673a373f7f0ce1db5646964162a0e10d950f7cb4719e3cf1686312e890796fc660374cfa1a88689029d226680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mcp \
python3.13dist-mcp \
python313-mcp \
python3dist-mcp"

RDEPENDS:${PN} += "python-abi \
python313-anyio \
python313-cryptography \
python313-httpx \
python313-httpx-sse \
python313-jsonschema \
python313-pydantic \
python313-pydantic-settings \
python313-python-multipart \
python313-sse-starlette \
python313-starlette \
python313-uvicorn"

inherit rpm
