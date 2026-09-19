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

PV = "2.18.19"

RPM_NAME = "ansible-test-2.18-2.18.19-1.1.noarch.rpm"
RPM_HASH = "f20e4edfeb6fb303e133f23d5c626e6f9517647a0a15adac0640670528d1ea221e647c5e0b0a6c3ee41a79aa239108c8a1a1e5249ddb7408cb7925f794d8e278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-test-2.18"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
ansible-core-2.18 \
python-abi \
python3-virtualenv"

inherit rpm
