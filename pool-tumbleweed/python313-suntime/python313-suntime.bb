SUMMARY = "Python sunset and sunrise time calculation"
DESCRIPTION = "Python sunset and sunrise time calculation library."
LICENSE = "LGPL-3.0-only"

PV = "1.3.2"

RPM_NAME = "python313-suntime-1.3.2-1.10.noarch.rpm"
RPM_HASH = "f1560fae9fd5c8ddd93c5c74e2b25594c26e4087a0f0eecf8f7a0f7576973d2566ac84e59b38a2f833883a100cd78a71619ac58467e933f17578bb3791b4ee7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-suntime \
python3.13dist-suntime \
python313-suntime \
python3dist-suntime"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil"

inherit rpm
