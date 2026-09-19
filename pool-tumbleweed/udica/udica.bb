SUMMARY = "A tool for generating SELinux security policies for containers"
DESCRIPTION = "Tool for generating SELinux security profiles for containers based on \
inspection of container JSON file."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.8"

RPM_NAME = "udica-0.2.8-2.4.noarch.rpm"
RPM_HASH = "10522db56b800fbc588e196e5f4d6f383e06836a10ccf5298e5485dc2b3c3001c3ab0a4c00c0df3aa25a26c45b9d2430b1c67b752b86c684d54a750cfc2ddf13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-udica \
python3dist-udica \
udica"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
container-selinux \
python-abi \
python3 \
python3-selinux \
python3-semanage \
python3-setuptools"

inherit rpm
