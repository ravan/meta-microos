SUMMARY = "A library to manipulate gettext files - documentation"
DESCRIPTION = "polib allows you to manipulate, create, modify gettext catalogs (.pot, .po and \
binary .mo files). You can load existing files, iterate through it's entries, \
add, modify entries, comments or metadata, etc... or create new po/pot files \
from scratch. \
 \
polib provides a simple and pythonic API, exporting only two convenience \
functions 'pofile' and 'mofile', and the 4 core classes: POFile, MOFile, \
POEntry and MOEntry for creating new files/entries. \
 \
This package contains documentation in HTML format."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python-polib-doc-1.2.0-3.10.noarch.rpm"
RPM_HASH = "a2c049cedaf1b88505b666d9845ce412b20735541055e954366f12da3ebbd6d533ad8651889942be51d1fcc58b188d8f14559c2a21884d662f28aae7ad161d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-polib-doc \
python313-polib-doc \
python314-polib-doc"

RDEPENDS:${PN} += ""

inherit rpm
