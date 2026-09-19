SUMMARY = "HTTP/2 framing layer for Python"
DESCRIPTION = "This library contains the HTTP/2 framing code used in the hyper project. \
It provides a pure-Python codebase that is capable of decoding a binary \
stream into HTTP/2 frames."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python313-hyperframe-6.1.0-1.5.noarch.rpm"
RPM_HASH = "a3e06dc6a6a7f18a0fdf2f4da1755ea0d05e334ee6092a202f6d1eb9d420b784a47622ce8f111831e878e7b35a74031fc0682a1f64238f1c8499b545f04f7554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hyperframe \
python3.13dist-hyperframe \
python313-hyperframe \
python3dist-hyperframe"

RDEPENDS:${PN} += "python-abi"

inherit rpm
