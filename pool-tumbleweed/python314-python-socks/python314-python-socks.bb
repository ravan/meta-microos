SUMMARY = "Core proxy client functionality for Python"
DESCRIPTION = "The python-socks package provides a core proxy client functionality for Python. \
Supports SOCKS4(a), SOCKS5, HTTP (tunneling) proxy and provides sync and async \
(asyncio, trio, curio) APIs. You probably don't need to use python-socks \
directly. It is used internally by aiohttp-socks and httpx-socks packages."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "python314-python-socks-2.8.1-1.2.noarch.rpm"
RPM_HASH = "769f41fb1126f44ff7eaaaed9f70eaab40f1ba7b056b60c02ff56f7dde3e198e4962052d3558167a65518b2db7437224c9aeabf3ed5be9242aca18f8c2fc6c9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-socks \
python314-python-socks \
python3dist-python-socks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
