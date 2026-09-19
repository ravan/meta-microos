SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "26.2.1"

RPM_NAME = "python312-pip-26.2.1-1.1.noarch.rpm"
RPM_HASH = "7e135aef443c145ac5758d626f7929f75ea00a12f3d69dcd6a14a9a7a75578fc34042de27980a61bc3bf96d570f7a582877aa040ebbd46c2fa510dee378539d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-pip \
python312-pip \
python3dist-pip"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python-abi"

inherit rpm
