SUMMARY = "Python module for Odorik API"
DESCRIPTION = "Python module to work with Odorik API."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python314-odorik-0.5-7.10.noarch.rpm"
RPM_HASH = "2da62e0775d40d35c3a4a64d88a31394eb6d08672183cb42e457e17ef257cfee9459e57da8e2ae18e0a5f2042b4c5c252e9bdc0bb57a086086f032a516663ee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-odorik \
python314-odorik \
python3dist-odorik"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-python-dateutil \
python314-xdg \
update-alternatives"

inherit rpm
