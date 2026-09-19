SUMMARY = "CLI tool to convert a python project's  strings to f-strings"
DESCRIPTION = "CLI tool to convert a python project's  strings to f-strings."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python314-flynt-1.0.6-1.6.noarch.rpm"
RPM_HASH = "3304010209ab2fef67eb558fc14cb6b9a4498fb89795a54633c2473f57f88fe6792efd7606ea6aec400fa193788e80946a3544f630cb6e0ee435300c8045ad9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flynt \
python314-flynt \
python3dist-flynt"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
