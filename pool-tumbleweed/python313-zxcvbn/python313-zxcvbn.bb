SUMMARY = "Python password strength estimator"
DESCRIPTION = "Python password strength estimator."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python313-zxcvbn-4.5.0-1.4.noarch.rpm"
RPM_HASH = "1cc6b92042148afbc8bf5bd6fdd255735c0f03c170f2cbdddf8d9cff23ea02c1e916a71a4bb16431ddb2b3b2bfe5e571e9ecf0f97363423b56bae1124ec9caaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zxcvbn \
python3.13dist-zxcvbn \
python313-zxcvbn \
python3dist-zxcvbn"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
