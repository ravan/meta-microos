SUMMARY = "Python pytest plugin for aiohttp support"
DESCRIPTION = "A library that provides fixtures for creation test aiohttp server and client."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python314-pytest-aiohttp-1.1.0-1.6.noarch.rpm"
RPM_HASH = "c2fa72f1f715c3a894fef1dabda68ccb5d5d593f2924f6a17ba19813dfa5014f5bdea355aaa12b89b652090b883f19a59fc7a2afb66673f7ec01006b2f7f7e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-aiohttp \
python314-pytest-aiohttp \
python3dist-pytest-aiohttp"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp \
python314-pytest \
python314-pytest-asyncio"

inherit rpm
