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

PV = "2.20.8"

RPM_NAME = "ansible-test-2.20-2.20.8-1.1.noarch.rpm"
RPM_HASH = "a92b521f9e7eb243be653751d0d94379fcb48037ad00a14da23f67e0c3f8eaa023358a0eeffeb8647c3e25327e8a9ab320961fd43eb40611c99f48d3b9dfab19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-test-2.20"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
ansible-core-2.20 \
python-abi \
python3-virtualenv"

inherit rpm
