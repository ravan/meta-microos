SUMMARY = "Python functions for working with SQLite FTS4 search"
DESCRIPTION = "Python functions for working with SQLite FTS4 search"
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python314-sqlite-fts4-1.0.3-2.5.noarch.rpm"
RPM_HASH = "1543409c1375f33f4484145c63a4024a85df98ab4ce22780a4bc69c2f3408316acdbe15202002b3317a939025fd61adeb8823603bbecd4b8ccb3ef93730139e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sqlite-fts4 \
python314-sqlite-fts4 \
python3dist-sqlite-fts4"

RDEPENDS:${PN} += "python-abi"

inherit rpm
