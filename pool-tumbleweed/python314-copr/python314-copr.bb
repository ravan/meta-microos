SUMMARY = "Python client for copr service"
DESCRIPTION = "Python client for copr service."
LICENSE = "GPL-2.0-or-later"

PV = "2.6"

RPM_NAME = "python314-copr-2.6-1.2.noarch.rpm"
RPM_HASH = "e0b9b59e8c1a492cb9b3abab4b2cf4f4f2e5d02171d0c802b9f9d236f688de68d59d6b4147b823692a6199ec66804eb1903a8651f91d95df9e825c26e5c41869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-copr \
python314-copr \
python3dist-copr"

RDEPENDS:${PN} += "python-abi \
python314-filelock \
python314-munch \
python314-requests \
python314-requests-toolbelt \
python314-setuptools"

inherit rpm
