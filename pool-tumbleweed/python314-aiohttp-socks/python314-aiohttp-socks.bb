SUMMARY = "SOCKS proxy connector for aiohttp"
DESCRIPTION = "SOCKS proxy connector for aiohttp"
LICENSE = "Apache-2.0"

PV = "0.12.0"

RPM_NAME = "python314-aiohttp-socks-0.12.0-1.1.noarch.rpm"
RPM_HASH = "ef5befee9e217847ab674e5b01a5bf856df1c4294ef0d4a9d9bb8d3a7b81dc9ff8d5fc46f6630280f75e6f41b141434e736ccba45d4bc2a23f936ed529bdfd18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiohttp-socks \
python314-aiohttp-socks \
python3dist-aiohttp-socks"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp \
python314-python-socks"

inherit rpm
