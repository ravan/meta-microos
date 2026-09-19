SUMMARY = "Python module for mocking out requests made by ClientSession from aiohttp"
DESCRIPTION = "This is a Python module for mocking out requests made by ClientSession \
from the aiohttp package."
LICENSE = "MIT"

PV = "0.7.8"

RPM_NAME = "python313-aioresponses-0.7.8-3.2.noarch.rpm"
RPM_HASH = "e35358c1e0f42c858ac660f5238c59dd5b54317f37b99292d2d9bf4c4e7ba28a7fee2d8fa5078a71eec658efb53d7f99c36be8effe568a1d0cffb77a1bbf1cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aioresponses \
python3.13dist-aioresponses \
python313-aioresponses \
python3dist-aioresponses"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp \
python313-packaging"

inherit rpm
