SUMMARY = "Git Object Database"
DESCRIPTION = "GitDB is a pure-Python git object database"
LICENSE = "BSD-3-Clause"

PV = "4.0.12"

RPM_NAME = "python314-gitdb-4.0.12-2.5.noarch.rpm"
RPM_HASH = "d56e765fc8c49b0f3fa1d6268252743d522849d9caae308ecaf99b673e070ec34cd127f637d9b3b9c60f8bd2ec518c032aeaac7c936d833117eb32df1193cc82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gitdb \
python314-gitdb \
python314-gitdb2 \
python3dist-gitdb"

RDEPENDS:${PN} += "python-abi \
python314-smmap"

inherit rpm
