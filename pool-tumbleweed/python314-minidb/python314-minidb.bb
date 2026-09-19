SUMMARY = "SQLite3-based store for Python objects"
DESCRIPTION = "Minidb 2 allows you to store Python objects in a SQLite 3 database."
LICENSE = "ISC"

PV = "2.0.8"

RPM_NAME = "python314-minidb-2.0.8-1.9.noarch.rpm"
RPM_HASH = "269aebd60a206de77781d5b32ca4c72927464fb0ac03fc0a8575568e8169721aa0daa30014c03b13f20c25c810953fdb5a6a0dacf6bbdd23e609db2b83d01e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-minidb \
python314-minidb \
python3dist-minidb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
