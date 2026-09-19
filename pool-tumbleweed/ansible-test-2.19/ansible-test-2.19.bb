SUMMARY = "Tool for testing ansible plugin and module code"
DESCRIPTION = "This package installs the ansible-test command for testing modules and plugins \
developed for ansible. \
 \
Ansible is a radically simple model-driven configuration management, multi-node \
deployment, and remote task execution system. Ansible works over SSH and does \
not require any software or daemons to be installed on remote nodes. Extension \
modules can be written in any language and are transferred to managed machines \
automatically."
LICENSE = "GPL-3.0-or-later"

PV = "2.19.12"

RPM_NAME = "ansible-test-2.19-2.19.12-1.1.noarch.rpm"
RPM_HASH = "9fbe2b999d3900fa02b53745965e858f76aafacaf6847b058ac79ee2b74c0bcf945fc4ff919dae095fe5460926e15db807eb616f6e057cd15d589675d49cd468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-test-2.19"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
ansible-core-2.19 \
python-abi \
python3-virtualenv"

inherit rpm
