SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple model-driven configuration management, multi-node \
deployment, and remote task execution system. Ansible works over SSH and does \
not require any software or daemons to be installed on remote nodes. Extension \
modules can be written in any language and are transferred to managed machines \
automatically."
LICENSE = "GPL-3.0-or-later"

PV = "11.13.0"

RPM_NAME = "ansible-11-11.13.0-1.3.noarch.rpm"
RPM_HASH = "f443d936d43e9ee75b313f358ce7592f2650c5c9ee725feee01ef8845575ddbd22769137a66abe20b1ad87a845f6a4cfa451b280cf1019dce831a678cd24a678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-11 \
python3.13dist-ansible \
python3dist-ansible"

RDEPENDS:${PN} += "-ansible-core >= 2.18.12 with ansible-core < 2.19.0 \
/usr/bin/python3.13 \
python3-base"

inherit rpm
