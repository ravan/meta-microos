SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.14.3"

RPM_NAME = "python314-aiohttp-3.14.3-1.1.aarch64.rpm"
RPM_HASH = "72a2d4b94bacccc49c3d5deaacbe1aa7d7366a5a85ac0ae5c9639d29272fdd9816482bbfaa6823b828dabb55e1f3e9f6962cb34cf0cab91f939798180879e0a5"

RPROVIDES:${PN} += "python3.14dist-aiohttp \
python314-aiohttp \
python3dist-aiohttp"

RDEPENDS:${PN} += "-python314-charset-normalizer >= 2.0 with python314-charset-normalizer < 4 \
-python314-multidict >= 4.5 with python314-multidict < 7 \
-python314-yarl >= 1.17.0 with python314-yarl < 2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-aiohappyeyeballs \
python314-aiosignal \
python314-attrs \
python314-frozenlist"

inherit rpm
