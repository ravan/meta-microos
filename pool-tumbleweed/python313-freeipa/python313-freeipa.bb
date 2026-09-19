SUMMARY = "Lightweight FreeIPA client"
DESCRIPTION = "python-freeipa is lightweight FreeIPA client."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python313-freeipa-1.0.6-2.5.noarch.rpm"
RPM_HASH = "09c1d749917a6201c93951052388fb2288eb839ae6d842e44430749ac5a6d13a3b7c4efb5efe4dd47040f9230af15e0529ddb4bdf647f1f011e373fdb88f41b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-freeipa \
python3.13dist-python-freeipa \
python313-freeipa \
python3dist-python-freeipa"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
