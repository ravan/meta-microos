SUMMARY = "Simple retry client for aiohttp"
DESCRIPTION = "Simple retry client for aiohttp."
LICENSE = "MIT"

PV = "2.9.1"

RPM_NAME = "python314-aiohttp-retry-2.9.1-3.4.noarch.rpm"
RPM_HASH = "a41a5a1b8d75e6cc49817c9751c6c485f8ea9d041a98fddbe81a61b55f9138010e4b3b88d1c0264fdf65de35250d1b181928a58cc4b34de825006439536438f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiohttp-retry \
python314-aiohttp-retry \
python3dist-aiohttp-retry"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp"

inherit rpm
