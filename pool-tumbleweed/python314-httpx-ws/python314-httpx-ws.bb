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

RPM_NAME = "python314-httpx-ws-0.9.0-1.3.noarch.rpm"
RPM_HASH = "5e3ca3de3feadd397d51d7de4965ec89889a25e1a428cc02822a62a88341871ef203d1c348baafc20cb0214b220e8646433de758cdf50db7089ec7488aa6dbc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpx-ws \
python314-httpx-ws \
python3dist-httpx-ws"

RDEPENDS:${PN} += "python-abi \
python314-anyio \
python314-httpcore \
python314-httpx \
python314-wsproto"

inherit rpm
