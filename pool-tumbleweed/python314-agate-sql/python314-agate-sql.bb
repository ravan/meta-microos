SUMMARY = "SQL read/write support for agate"
DESCRIPTION = "Agate-sql adds SQL read/write support to agate."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python314-agate-sql-0.7.3-1.3.noarch.rpm"
RPM_HASH = "611ec6c58ce7fa5e9a9b0c6440f6599e3965747bd13e96eff2581eba560995c189b3a975b917873e402147e41a43fbf8f2f515fbe4de1bfe27828da7c4710974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-agate-sql \
python314-agate-sql \
python3dist-agate-sql"

RDEPENDS:${PN} += "python-abi \
python314-SQLAlchemy \
python314-agate"

inherit rpm
