SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "26.2.1"

RPM_NAME = "python314-pip-26.2.1-1.1.noarch.rpm"
RPM_HASH = "b8bfeac2f830644e4e51fde8972bd23a75c7f785f07ed0b0505b93480ae3a387b9b8a90bd32a3c5f40bc8dcf8bb32c67dd664507fad0145806450ce7ddc08d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pip \
python314-pip \
python3dist-pip"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python-abi"

inherit rpm
