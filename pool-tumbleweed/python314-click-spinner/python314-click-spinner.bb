SUMMARY = "Spinner for Click"
DESCRIPTION = "Spinner for Click."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python314-click-spinner-0.1.10-3.12.noarch.rpm"
RPM_HASH = "d9b4bad7fbf8cd4c029196dc62adf7dd505d81c2b9c6a54f9373de5d808bbeb78886241ea2eba2191b19968946ba0f2d76c014d637673bea212d722a2d5ab123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-spinner \
python314-click-spinner \
python3dist-click-spinner"

RDEPENDS:${PN} += "python-abi \
python314-click"

inherit rpm
