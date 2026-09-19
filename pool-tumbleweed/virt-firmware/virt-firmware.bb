SUMMARY = "Tools for virtual machine firmware volumes"
DESCRIPTION = "Tools for virtual machine firmware volumes."
LICENSE = "GPL-2.0-only"

PV = "25.12"

RPM_NAME = "virt-firmware-25.12-2.2.noarch.rpm"
RPM_HASH = "aaff0243e9d46e52a9b1822b140bda15385654c22438115f6ef966be3914c8003935aea179ae8f0164a03b8f4e2f957f50e412b5d94f1eb829f59dc0ce721fae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-virt-firmware \
python3dist-virt-firmware \
virt-firmware"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-cryptography \
python3-pefile \
python3-setuptools"

inherit rpm
