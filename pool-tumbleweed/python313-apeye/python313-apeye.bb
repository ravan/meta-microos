SUMMARY = "Handy tools for working with URLs and APIs"
DESCRIPTION = "Handy tools for working with URLs and APIs."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "python313-apeye-1.4.1-2.7.noarch.rpm"
RPM_HASH = "6997f8ce2c30bd4a6667c62dda74ddedf489a034dbb911d477c5185a734df1a25be107f2398a84504aee8498519ac5d7c6756633f244174204f7b58aa2b89ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apeye \
python3.13dist-apeye \
python313-apeye \
python3dist-apeye"

RDEPENDS:${PN} += "python-abi \
python313-apeye-core \
python313-domdf-python-tools \
python313-platformdirs \
python313-requests"

inherit rpm
