SUMMARY = "Python password strength estimator"
DESCRIPTION = "Python password strength estimator."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python314-zxcvbn-4.5.0-1.4.noarch.rpm"
RPM_HASH = "65b68dfb3f31b389c26fff48153666276502e9a14b74a7857146239d2911f860ec6dbbb264d928d6cfcb10eafe29c8e67fe8c4a7a56b59ecfadd442f695e39b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zxcvbn \
python314-zxcvbn \
python3dist-zxcvbn"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
