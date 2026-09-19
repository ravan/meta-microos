SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.14.3"

RPM_NAME = "python313-aiohttp-3.14.3-1.1.aarch64.rpm"
RPM_HASH = "da62c6b598ae5351616a75e54686f7fd4ccb3128129cd3c45992e29fc700e2db7cff73b359ddddf6c18ba1bf4be5bbd8d0c7106ab464d5dddbdb897fb3c271e8"

RPROVIDES:${PN} += "python3-aiohttp \
python3.13dist-aiohttp \
python313-aiohttp \
python3dist-aiohttp"

RDEPENDS:${PN} += "-python313-charset-normalizer >= 2.0 with python313-charset-normalizer < 4 \
-python313-multidict >= 4.5 with python313-multidict < 7 \
-python313-yarl >= 1.17.0 with python313-yarl < 2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-aiohappyeyeballs \
python313-aiosignal \
python313-attrs \
python313-frozenlist"

inherit rpm
