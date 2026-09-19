SUMMARY = "Utilities jointly used by devpi-server and devpi-client"
DESCRIPTION = "Utilities jointly used by devpi-server and devpi-client."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "python313-devpi-common-4.1.1-1.2.noarch.rpm"
RPM_HASH = "e1f0177dda1d103d6ba588c4db4b4e5e141c0c69bf6f7a5c4e3079699668c5a56b203add74fe7ff1a801da8c6f1ce2fc7d041fff0a72195517f2fab6ac82a587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-devpi-common \
python3.13dist-devpi-common \
python313-devpi-common \
python3dist-devpi-common"

RDEPENDS:${PN} += "python-abi \
python313-lazy \
python313-packaging-legacy \
python313-requests"

inherit rpm
