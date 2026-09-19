SUMMARY = "Dictdiffer is a library that helps you to diff and patch dictionaries"
DESCRIPTION = "Dictdiffer is a library that helps you to diff and patch dictionaries."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-dictdiffer-0.9.0-5.5.noarch.rpm"
RPM_HASH = "556c6db88e29dd929a2709fc48df837a8cf07b9aaf2d5511edd9f36e1ce9d79362c5726679ba36c73c21e20e8af08e68bc7a525de94dcff9ffe10a4c6db62981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dictdiffer \
python3.13dist-dictdiffer \
python313-dictdiffer \
python3dist-dictdiffer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
