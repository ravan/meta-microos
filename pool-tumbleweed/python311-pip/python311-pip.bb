SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "26.2.1"

RPM_NAME = "python311-pip-26.2.1-1.1.noarch.rpm"
RPM_HASH = "6314a9a4876fdf5214373ed208dfaa3431b28bb9938b32579012ca8461549d66c7f0fc595d8467ffb5239f722294a6f2d95d99e15b34d91ee33f542e265bdbf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pip \
python311-pip \
python3dist-pip"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python-abi"

inherit rpm
