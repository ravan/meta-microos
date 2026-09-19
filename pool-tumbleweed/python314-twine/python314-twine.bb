SUMMARY = "Collection of utilities for interacting with PyPI"
DESCRIPTION = "Twine is a utility for publishing Python packages on PyPI. \
 \
Currently it supports registering projects, uploading distributions, and \
checking, if descriptions will render correctly."
LICENSE = "Apache-2.0"

PV = "6.2.0"

RPM_NAME = "python314-twine-6.2.0-2.1.noarch.rpm"
RPM_HASH = "efcb08018aca682560be818f32aa0ff457a139421341d1d24c60583fbdc5b7ec62f54c1bcb4a7448ae630f281664f724d82a8b4d4f56766b526048369ca17b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-twine \
python314-twine \
python3dist-twine"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-id \
python314-keyring \
python314-packaging \
python314-readme-renderer \
python314-requests \
python314-requests-toolbelt \
python314-rfc3986 \
python314-rich \
python314-urllib3"

inherit rpm
