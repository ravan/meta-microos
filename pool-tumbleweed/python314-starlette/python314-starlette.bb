SUMMARY = "Lightweight ASGI framework/toolkit"
DESCRIPTION = "Starlette is a lightweight ASGI framework/toolkit, which is ideal for \
building high performance asyncio services."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "python314-starlette-1.6.0-1.1.noarch.rpm"
RPM_HASH = "f757818a747d9b151eda688b600fe2ebac81df7a50885668b4ce7f7f0965f27bc0996f3cb032650ff74b4daaf1b44ec2774e24c17b6e82648a0b269c5ab0a546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-starlette \
python314-starlette \
python3dist-starlette"

RDEPENDS:${PN} += "python-abi \
python314-anyio"

inherit rpm
