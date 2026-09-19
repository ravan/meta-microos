SUMMARY = "A Python wrapper library for subprocess module"
DESCRIPTION = "A Python wrapper library for subprocess module."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python313-subprocrunner-2.0.1-2.5.noarch.rpm"
RPM_HASH = "32827ab94003f678f8e97c3f8b961c2c911cf86e06ce4ddd722b07486968d7786c051a071d49e133f02688ca3797500216b588e2e81c6d82ab2224509bd20e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subprocrunner \
python3.13dist-subprocrunner \
python313-subprocrunner \
python3dist-subprocrunner"

RDEPENDS:${PN} += "python-abi \
python313-loguru \
python313-mbstrdecoder \
python313-typepy"

inherit rpm
