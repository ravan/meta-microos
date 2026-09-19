SUMMARY = "FTP client/server for asyncio"
DESCRIPTION = "aioftp is a python FTP client/server based on asyncio."
LICENSE = "Apache-2.0"

PV = "0.27.2"

RPM_NAME = "python314-aioftp-0.27.2-1.4.noarch.rpm"
RPM_HASH = "b1e086bd40cc03cf6fbccb82d651f914c931060063b7874075303c02bfc162e86c9d9a005fc13bc8f396d8a2d80fe633f54beec8d5529454d71dc284c6a02fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aioftp \
python314-aioftp \
python3dist-aioftp"

RDEPENDS:${PN} += "python-abi \
python314-siosocks"

inherit rpm
