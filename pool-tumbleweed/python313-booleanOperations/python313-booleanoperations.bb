SUMMARY = "Boolean operations on paths"
DESCRIPTION = "Boolean operations on paths."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python313-booleanOperations-0.10.0-1.5.noarch.rpm"
RPM_HASH = "ba0581ea7171773af3bafc7a6b3e3c0aecd11c58be3f671a618e827d44c9447b4b105053a74fde6704dda1fcd4fa7eae5be6c0bacf7361e1ff9a23a851cbc0d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-booleanOperations \
python3.13dist-booleanoperations \
python313-booleanOperations \
python3dist-booleanoperations"

RDEPENDS:${PN} += "python-abi \
python313-FontTools \
python313-pyclipper"

inherit rpm
