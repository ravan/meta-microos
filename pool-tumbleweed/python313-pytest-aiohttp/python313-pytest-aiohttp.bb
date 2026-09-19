SUMMARY = "Python pytest plugin for aiohttp support"
DESCRIPTION = "A library that provides fixtures for creation test aiohttp server and client."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python313-pytest-aiohttp-1.1.0-1.6.noarch.rpm"
RPM_HASH = "3f1baeb4c05aba04491b8ca4a8c89bdaffce6ea133a3e7f634db3c6789b0a04469f45f69640c68cfd48f30f10a0fac871fd5539592d3acbe36fd513d104fed66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-aiohttp \
python3.13dist-pytest-aiohttp \
python313-pytest-aiohttp \
python3dist-pytest-aiohttp"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp \
python313-pytest \
python313-pytest-asyncio"

inherit rpm
