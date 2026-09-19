SUMMARY = "Python client for copr service"
DESCRIPTION = "Python client for copr service."
LICENSE = "GPL-2.0-or-later"

PV = "2.6"

RPM_NAME = "python313-copr-2.6-1.2.noarch.rpm"
RPM_HASH = "81ed4cf5e42b00c0339bc60b8e5de9b926b790a7b70b63917ddaad57621e9e83a8cd0b1e08bb26289ecbc45014686b813aa358c72cb5c8892f2ac5f962806f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-copr \
python3.13dist-copr \
python313-copr \
python3dist-copr"

RDEPENDS:${PN} += "python-abi \
python313-filelock \
python313-munch \
python313-requests \
python313-requests-toolbelt \
python313-setuptools"

inherit rpm
