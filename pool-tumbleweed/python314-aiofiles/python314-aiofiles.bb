SUMMARY = "File support for asyncio"
DESCRIPTION = "aiofiles: file support for asyncio"
LICENSE = "Apache-2.0"

PV = "24.1.0"

RPM_NAME = "python314-aiofiles-24.1.0-1.10.noarch.rpm"
RPM_HASH = "6b42fb327fa8daf2a04901141c5f01bab92258b54a48c0e6042cca7a9aa01d96ae1e198bc6f111513cd01750afb13db7f4db9f1684fcd7d217229e923bdc64a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiofiles \
python314-aiofiles \
python3dist-aiofiles"

RDEPENDS:${PN} += "python-abi"

inherit rpm
