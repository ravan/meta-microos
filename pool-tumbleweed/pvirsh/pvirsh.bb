SUMMARY = "Parallel virsh command to manage a selected group of Virtual Machine"
DESCRIPTION = "Parallel virsh command to manage a selected group of Virtual Machine. \
This provides an easy way to execute the same command on a selected \
group of Virtual Machine."
LICENSE = "GPL-3.0-or-later"

PV = "2.2"

RPM_NAME = "pvirsh-2.2-3.1.noarch.rpm"
RPM_HASH = "a40edbafa2023f787dc624861dde8c90322e8a06d0b4845b674748582853885d66e52fb894746421f36f0aa36316bf820bb85072c98737805d502454dc316c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pvirsh \
pvirsh \
python3-pvirsh \
python3.13dist-pvirsh \
python3dist-pvirsh"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-curses \
python3-libvirt-python"

inherit rpm
