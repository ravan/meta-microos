SUMMARY = "Zope Object Database: object database and persistence"
DESCRIPTION = "This package contains documentation files for python-ZODB."
LICENSE = "ZPL-2.1"

PV = "6.3"

RPM_NAME = "python-ZODB-doc-6.3-1.2.noarch.rpm"
RPM_HASH = "a76c701445e85fca0bd3a22a8346743f83886a274b1b8b27c0ad473c9eda88fb5d295dc2a1c11d73f71dbffb2893ea3c41e8bc73391acdb4a4224df8a2ccfbc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ZODB-doc \
python313-ZODB-doc \
python314-ZODB-doc"

RDEPENDS:${PN} += ""

inherit rpm
