SUMMARY = "SQLite3-based store for Python objects"
DESCRIPTION = "Minidb 2 allows you to store Python objects in a SQLite 3 database."
LICENSE = "ISC"

PV = "2.0.8"

RPM_NAME = "python313-minidb-2.0.8-1.9.noarch.rpm"
RPM_HASH = "98a41f43e0d5a144df861cb599f512b5e10912c95ad67b2bd2ae54f8dd590449cf7f5c7e6514b2dee170fde8b76afd6ccb0e761b24c37584bd2c3f61dffa2c42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-minidb \
python3.13dist-minidb \
python313-minidb \
python3dist-minidb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
