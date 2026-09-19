SUMMARY = "Tool to create XML guest configuration and prepare the host for a scenario"
DESCRIPTION = "A tool to generate a customized libvirt XML guest and prepare the host. \
The idea is to improve the experience of usage compared to a basic setting. \
This tool also simplifies the creation of secure VM (AMD SEV)."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.3"

RPM_NAME = "python313-virt-scenario-2.1.3-4.1.noarch.rpm"
RPM_HASH = "7cadf7276df0ccb6dd3f5263cf685be2b1b50a7166ce95b528c0b32f532803a5e24ab95ce482218b97a30f4b7881f3b01dfff25bd16973cf4a1ef4958f5c5eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python313-virt-scenario \
python3-virt-scenario \
python3.13dist-virt-scenario \
python313-virt-scenario \
python3dist-virt-scenario \
virt-scenario"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-PyYAML \
python313-curses \
python313-libvirt-python \
python313-psutil \
python313-pyudev"

inherit rpm
