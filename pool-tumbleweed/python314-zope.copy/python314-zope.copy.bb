SUMMARY = "Pluggable object copying mechanism"
DESCRIPTION = "This package provides a pluggable mechanism for copying persistent objects. \
 \
Documentation is hosted at https://zopecopy.readthedocs.io/en/latest/"
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python314-zope.copy-6.0-1.4.noarch.rpm"
RPM_HASH = "ce8e3840c638d4728f936b039da765f15b1af256bbae1d907565015f8d5b974227a0b1098201a0e6c4829bd4c8c4a5c0e6145705c5f858a3bd32363f99bdfd9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.copy \
python314-zope.copy \
python3dist-zope.copy"

RDEPENDS:${PN} += "python-abi \
python314-zodbpickle \
python314-zope.interface"

inherit rpm
