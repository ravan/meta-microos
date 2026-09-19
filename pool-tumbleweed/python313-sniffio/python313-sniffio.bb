SUMMARY = "Module to sniff which async library code runs under"
DESCRIPTION = "This is a package for detecting which async library code is running \
under. It supports multiple async I/O packages, like Trio, and \
asyncio."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.1"

RPM_NAME = "python313-sniffio-1.3.1-1.10.noarch.rpm"
RPM_HASH = "36ae2498bface9e3bbd84f9787d93342d5def932ef2f4b944ebc33e4ae94498c9182d9beb5386d1d85887a8ffe3bfa62b9bface1397011ad22b479586d82504f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sniffio \
python3.13dist-sniffio \
python313-sniffio \
python3dist-sniffio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
