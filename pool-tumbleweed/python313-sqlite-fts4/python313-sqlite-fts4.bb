SUMMARY = "Python functions for working with SQLite FTS4 search"
DESCRIPTION = "Python functions for working with SQLite FTS4 search"
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python313-sqlite-fts4-1.0.3-2.5.noarch.rpm"
RPM_HASH = "16170047a634da492394aae71ff17fa452bbba96987d9dfe4f59594a53e77583a646e097cdef8091ed970007108d8de6bf76007ee7d1a606c05b0c96e94ee426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlite-fts4 \
python3.13dist-sqlite-fts4 \
python313-sqlite-fts4 \
python3dist-sqlite-fts4"

RDEPENDS:${PN} += "python-abi"

inherit rpm
