SUMMARY = "Module to identify specific nodes in a JSON document"
DESCRIPTION = "A module to identify specific nodes in a JSON document (according to draft 08)."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python314-jsonpointer-3.1.1-1.3.noarch.rpm"
RPM_HASH = "fef27f95ea73f74e97ef1d290402693549135821237109a1990693423fbb85f69e91d97192b59b6072b07d31fce08a0cbbd21cd82df0e8d75c99a3db8c9173b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonpointer \
python314-jsonpointer \
python3dist-jsonpointer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
