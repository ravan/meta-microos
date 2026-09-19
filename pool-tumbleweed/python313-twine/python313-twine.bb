SUMMARY = "Collection of utilities for interacting with PyPI"
DESCRIPTION = "Twine is a utility for publishing Python packages on PyPI. \
 \
Currently it supports registering projects, uploading distributions, and \
checking, if descriptions will render correctly."
LICENSE = "Apache-2.0"

PV = "6.2.0"

RPM_NAME = "python313-twine-6.2.0-2.1.noarch.rpm"
RPM_HASH = "59b77472805244f8c28b0dde6c243e2c9a5d7f47424e737462ec30db36f5aaf42da6baaa16de34e808062cc2817192cab45ce783ff8d5161d48bbe09f14b3d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-twine \
python3.13dist-twine \
python313-twine \
python3dist-twine"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-id \
python313-keyring \
python313-packaging \
python313-readme-renderer \
python313-requests \
python313-requests-toolbelt \
python313-rfc3986 \
python313-rich \
python313-urllib3"

inherit rpm
