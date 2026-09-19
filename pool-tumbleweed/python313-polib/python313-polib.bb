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

RPM_NAME = "python313-polib-1.2.0-3.10.noarch.rpm"
RPM_HASH = "e291f96c34e75ccdbfcb2bb4dd930d89be33690e1fecc002b180189e583575e246246d0e2cd53359e5a6d413a08ad88d228b005f1387cab3353a90988b5642e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-polib \
python3.13dist-polib \
python313-polib \
python3dist-polib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
