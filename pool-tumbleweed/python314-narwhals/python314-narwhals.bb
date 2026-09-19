SUMMARY = "Extremely lightweight compatibility layer between dataframe libraries"
DESCRIPTION = "Extremely lightweight and extensible compatibility layer between \
dataframe libraries!"
LICENSE = "MIT"

PV = "2.24.0"

RPM_NAME = "python314-narwhals-2.24.0-1.1.noarch.rpm"
RPM_HASH = "f4f7ddd87dda50811527ccbb9df3d827189d68a4ebb021780602a06a66a7681816c321cf929035389e154c1b038cfa3b3a1585dc997bffa677eb4a3ab141380e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-narwhals \
python314-narwhals \
python3dist-narwhals"

RDEPENDS:${PN} += "python-abi"

inherit rpm
