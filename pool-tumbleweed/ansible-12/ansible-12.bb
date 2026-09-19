SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple model-driven configuration management, multi-node \
deployment, and remote task execution system. Ansible works over SSH and does \
not require any software or daemons to be installed on remote nodes. Extension \
modules can be written in any language and are transferred to managed machines \
automatically."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0"

RPM_NAME = "ansible-12-12.3.0-1.3.noarch.rpm"
RPM_HASH = "5aee6da60280184e3faa9250894dd0887388b44b530c1391c0dada0174f011c0c9b82227b5cf37df36e762ef0cef3cd36ad9846e3a076251ee9dd7e9f8613bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-12 \
python3.13dist-ansible \
python3dist-ansible"

RDEPENDS:${PN} += "-ansible-core >= 2.19.5 with ansible-core < 2.20.0 \
/usr/bin/python3.13 \
python3-base"

inherit rpm
