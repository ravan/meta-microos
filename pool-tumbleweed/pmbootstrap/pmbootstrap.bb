SUMMARY = "Sophisticated chroot/build/flash tool to develop and install postmarketOS"
DESCRIPTION = "Sophisticated chroot/build/flash tool to develop and install postmarketOS"
LICENSE = "GPL-3.0-or-later"

PV = "3.11.1"

RPM_NAME = "pmbootstrap-3.11.1-1.1.noarch.rpm"
RPM_HASH = "ca6db136ae8875d274d6048b7771186fd94e6abb9216f77560156bb3abcabb9066588699f0374b31d5d85c9589b8d6b7dea205d51db85af9fc6440ab183d67d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pmbootstrap \
python3.13dist-pmbootstrap \
python3dist-pmbootstrap"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
