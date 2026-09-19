SUMMARY = "A document-oriented database"
DESCRIPTION = "TinyDB is a document oriented database written in \
pure Python and has no external dependencies. \
The target are small apps that would be “blown away” by a SQL-DB or an \
external database server."
LICENSE = "MIT"

PV = "4.8.2"

RPM_NAME = "python314-tinydb-4.8.2-1.8.noarch.rpm"
RPM_HASH = "a8faf6068442c7b2cdb5678ee00cf81b9a70428fc24e7bcffc7b3b560dd730406bd5398f7f72fc38184d8217050d360d507f7c0fba38e8a2e040a7905e046e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tinydb \
python314-tinydb \
python3dist-tinydb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
