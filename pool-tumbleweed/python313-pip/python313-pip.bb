SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "26.2.1"

RPM_NAME = "python313-pip-26.2.1-1.1.noarch.rpm"
RPM_HASH = "eaf477db7aba19a9958ffb336a6c0e984664df71ad290182f0189ddcb3b4b69f289816d7059a781fe19eca037783d05398bfb4e71e8255039c572efee886a709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip \
python3.13dist-pip \
python313-pip \
python3dist-pip"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python-abi"

inherit rpm
