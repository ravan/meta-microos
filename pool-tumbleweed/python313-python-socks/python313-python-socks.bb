SUMMARY = "Core proxy client functionality for Python"
DESCRIPTION = "The python-socks package provides a core proxy client functionality for Python. \
Supports SOCKS4(a), SOCKS5, HTTP (tunneling) proxy and provides sync and async \
(asyncio, trio, curio) APIs. You probably don't need to use python-socks \
directly. It is used internally by aiohttp-socks and httpx-socks packages."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "python313-python-socks-2.8.1-1.2.noarch.rpm"
RPM_HASH = "c06eb4b2641b7e4aae1fe2842bc1c5e92ee29ab090d711ec94badf7e37ab6d85b6d27e1846bef3354854b57be81f5b25f18db32ad944fe3534994cfa1302dc7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-socks \
python3.13dist-python-socks \
python313-python-socks \
python3dist-python-socks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
