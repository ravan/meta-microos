SUMMARY = "A document-oriented database"
DESCRIPTION = "TinyDB is a document oriented database written in \
pure Python and has no external dependencies. \
The target are small apps that would be “blown away” by a SQL-DB or an \
external database server."
LICENSE = "MIT"

PV = "4.8.2"

RPM_NAME = "python313-tinydb-4.8.2-1.8.noarch.rpm"
RPM_HASH = "a14c7603bd72fae76328d42960952b345aeed8bf8cc2bee6718ef7ec9e107c18f695c3b1bd53e78d05aaffbff19f17a3be1a4552d89443ab5c90964832afb68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinydb \
python3.13dist-tinydb \
python313-tinydb \
python3dist-tinydb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
