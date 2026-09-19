SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple model-driven configuration management, multi-node \
deployment, and remote task execution system. Ansible works over SSH and does \
not require any software or daemons to be installed on remote nodes. Extension \
modules can be written in any language and are transferred to managed machines \
automatically."
LICENSE = "GPL-3.0-or-later"

PV = "13.8.0"

RPM_NAME = "ansible-13-13.8.0-1.2.noarch.rpm"
RPM_HASH = "54cbc7403e3aaf1f6c6564ceca9d98b3fcc4f5ad95f6bcc4b36caae8eec2083153f0df8cbdf4f06f6786e305452621f15275ad2a1094fd87ef62a55db5e43f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-13 \
python3.13dist-ansible \
python3dist-ansible"

RDEPENDS:${PN} += "-ansible-core >= 2.20.7 with ansible-core < 2.21.0 \
/usr/bin/python3.13 \
python3-base"

inherit rpm
