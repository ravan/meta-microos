SUMMARY = "Pure-Python Git Library"
DESCRIPTION = "Simple Pure-Python implementation of the Git file formats and protocols. Dulwich \
is the place where Mr. and Mrs. Git live in one of the Monty Python sketches."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "1.2.14"

RPM_NAME = "python314-dulwich-1.2.14-1.1.aarch64.rpm"
RPM_HASH = "e92d4c1b24ed38f5d12ab60f62689798654ef3409c846036d941c28ec172ff5ae0273f9d5af6bcce5ac740c9b7b1439d1bf0d662c1fb54f6e95a4dd05bdb1ce0"

RPROVIDES:${PN} += "python3.14dist-dulwich \
python314-dulwich \
python3dist-dulwich"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-urllib3"

inherit rpm
