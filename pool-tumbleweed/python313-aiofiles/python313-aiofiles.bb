SUMMARY = "File support for asyncio"
DESCRIPTION = "aiofiles: file support for asyncio"
LICENSE = "Apache-2.0"

PV = "24.1.0"

RPM_NAME = "python313-aiofiles-24.1.0-1.10.noarch.rpm"
RPM_HASH = "de6c945180fa80bc019370aafe8d2cf9a6adc98c6f9463329caf117897c46c4b0627c36687dc54d2416067e884a8833778dec09f7830b7d87fc75060a35f6efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiofiles \
python3.13dist-aiofiles \
python313-aiofiles \
python3dist-aiofiles"

RDEPENDS:${PN} += "python-abi"

inherit rpm
