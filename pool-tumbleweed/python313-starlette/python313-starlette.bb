SUMMARY = "Lightweight ASGI framework/toolkit"
DESCRIPTION = "Starlette is a lightweight ASGI framework/toolkit, which is ideal for \
building high performance asyncio services."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "python313-starlette-1.6.0-1.1.noarch.rpm"
RPM_HASH = "f283c1539d747df4c39c17b13d8142393865b0cbc91401357911738d8eddb385d6896acd7f18674da0713b2ad2a6fc0496d6400f033bf172e61ef7d40f86e3e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-starlette \
python3.13dist-starlette \
python313-starlette \
python3dist-starlette"

RDEPENDS:${PN} += "python-abi \
python313-anyio"

inherit rpm
