SUMMARY = "Extend python requests with exponential back-off retry"
DESCRIPTION = "A Python library for HTTP requests using requests package with \
exponential back-off retry."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python313-retryrequests-0.2.0-2.5.noarch.rpm"
RPM_HASH = "9e4af9b23b07c519422b343eb52304d995c60a33a74908e1b96dc0a98cef5db94cfc06cba903be61f6e9c2d60f7bfba9d328afa6d5f6d1c8ef067c4330c1091e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retryrequests \
python3.13dist-retryrequests \
python313-retryrequests \
python3dist-retryrequests"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-setuptools"

inherit rpm
