SUMMARY = "SSE plugin for Starlette"
DESCRIPTION = "SSE plugin for Starlette"
LICENSE = "BSD-3-Clause"

PV = "3.4.8"

RPM_NAME = "python313-sse-starlette-3.4.8-1.1.noarch.rpm"
RPM_HASH = "1bcf500b64822158e4a2a99ce2e3904409c71e35ff3226109ef39319d2ee159674990ea2c2b57574c7808cc0dc92a7db07754be46437ace4e9f4d41658067663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sse-starlette \
python3.13dist-sse-starlette \
python313-sse-starlette \
python3dist-sse-starlette"

RDEPENDS:${PN} += "python-abi \
python313-anyio \
python313-starlette"

inherit rpm
