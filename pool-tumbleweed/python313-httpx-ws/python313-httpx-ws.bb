SUMMARY = "WebSockets support for HTTPX"
DESCRIPTION = "WebSockets support for HTTPX \
* [X] Sync and async client \
* [X] Helper methods to send text, binary and JSON data \
* [X] Helper methods to receive text, binary and JSON data \
* [X] Automatic ping/pong answers \
* [X] HTTPX transport to test WebSockets defined in ASGI apps \
* [X] Automatic keepalive ping \
* [X] asyncio and Trio support through AnyIO"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-httpx-ws-0.9.0-1.3.noarch.rpm"
RPM_HASH = "c76626d02719217004bbe02512dc7165fd25dfa30c7d2a1871b47ae415c1244fe542737f395c37ccc2ea55f40acce4e29d4e81acadf32cc1ed0be81bebbba5f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpx-ws \
python3.13dist-httpx-ws \
python313-httpx-ws \
python3dist-httpx-ws"

RDEPENDS:${PN} += "python-abi \
python313-anyio \
python313-httpcore \
python313-httpx \
python313-wsproto"

inherit rpm
