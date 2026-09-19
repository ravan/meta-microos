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

PV = "2.21.3"

RPM_NAME = "ansible-test-2.21.3-1.1.noarch.rpm"
RPM_HASH = "4f124d134b635b648726b4d32786131731956ae086dfbba805f95c06c63a48c4543d1c262b02a67fd3dc0bb0f468e03d940dd94da43bd160ccc8783f166a7dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-test"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
ansible-core \
python-abi \
python3-virtualenv"

inherit rpm
