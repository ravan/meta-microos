SUMMARY = "A web framework for building APIs and app backends"
DESCRIPTION = "Falcon is a Python framework for building cloud \
APIs. It encourages the REST architectural style, and tries to do \
as little as possible while remaining effective."
LICENSE = "Apache-2.0"

PV = "4.3.1"

RPM_NAME = "python314-falcon-4.3.1-1.1.noarch.rpm"
RPM_HASH = "4a62661164aa151fec3065ac0b436a99f8984efd400d6a97c18f126d1c4e9789faa1eb29b72ededa6ed6886a566736872487a43348ba9fde6500e000ad628549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-falcon \
python314-falcon \
python3dist-falcon"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
