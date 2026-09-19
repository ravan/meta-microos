SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple model-driven configuration management, multi-node \
deployment, and remote task execution system. Ansible works over SSH and does \
not require any software or daemons to be installed on remote nodes. Extension \
modules can be written in any language and are transferred to managed machines \
automatically."
LICENSE = "GPL-3.0-or-later"

PV = "14.3.1"

RPM_NAME = "ansible-14.3.1-1.1.noarch.rpm"
RPM_HASH = "e4ac8c8dd384b55ce465ddab2262b772e7708f2d8cf3b1178f69822d494a0245fb4591d3e63a62458c81b7ee675ce0c9791e36a47b6bc5ad2c15553aa046a5e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible \
python3.13dist-ansible \
python3dist-ansible"

RDEPENDS:${PN} += "-ansible-core >= 2.21.3 with ansible-core < 2.22.0 \
/usr/bin/python3.13 \
python3-base"

inherit rpm
