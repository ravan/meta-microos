SUMMARY = "A library to manipulate gettext files"
DESCRIPTION = "polib allows you to manipulate, create, modify gettext catalogs (.pot, .po and \
binary .mo files). You can load existing files, iterate through it's entries, \
add, modify entries, comments or metadata, etc... or create new po/pot files \
from scratch. \
 \
polib provides a simple and pythonic API, exporting only two convenience \
functions 'pofile' and 'mofile', and the 4 core classes: POFile, MOFile, \
POEntry and MOEntry for creating new files/entries."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-polib-1.2.0-3.10.noarch.rpm"
RPM_HASH = "9a8bdf99f78a82f10aee5f20af4c20532829f9a2048a4bb7e74ec202916bab610231540b255b998d286f5a66888d7ef77188b75fd990dae1817c294d8ece082a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-polib \
python314-polib \
python3dist-polib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
