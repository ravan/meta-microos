SUMMARY = "Python module for mocking out requests made by ClientSession from aiohttp"
DESCRIPTION = "This is a Python module for mocking out requests made by ClientSession \
from the aiohttp package."
LICENSE = "MIT"

PV = "0.7.8"

RPM_NAME = "python314-aioresponses-0.7.8-3.2.noarch.rpm"
RPM_HASH = "9d4e711849dafc9b00aa5b87b99ca2ae03a2eb482050653dd64a8c5eaee9f03db7020f13f55b23b2dcad10a33efee36bf2b55ec9b343dd0456999a4e956f8e69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aioresponses \
python314-aioresponses \
python3dist-aioresponses"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp \
python314-packaging"

inherit rpm
