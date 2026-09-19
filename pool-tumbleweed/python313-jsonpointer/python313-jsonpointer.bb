SUMMARY = "Module to identify specific nodes in a JSON document"
DESCRIPTION = "A module to identify specific nodes in a JSON document (according to draft 08)."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python313-jsonpointer-3.1.1-1.3.noarch.rpm"
RPM_HASH = "769e38ad53de11628245f20f833f504d578efc81c63ac0518aa84c0a48dde9e89f472e4d7e6269f7705cee84d303e74b699d8af02140565c2a01e985ef4fd5fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpointer \
python3.13dist-jsonpointer \
python313-jsonpointer \
python3dist-jsonpointer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
