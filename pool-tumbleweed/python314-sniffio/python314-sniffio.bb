SUMMARY = "Module to sniff which async library code runs under"
DESCRIPTION = "This is a package for detecting which async library code is running \
under. It supports multiple async I/O packages, like Trio, and \
asyncio."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.1"

RPM_NAME = "python314-sniffio-1.3.1-1.10.noarch.rpm"
RPM_HASH = "3d8e1d3ee4be9cc3b59440cb88bb01d3180d7bd342243157288630b39c15923cc81d4ce0b30dbbbf3b718ab27ebae1d695b1373882264a944b3e50dcae635f7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sniffio \
python314-sniffio \
python3dist-sniffio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
