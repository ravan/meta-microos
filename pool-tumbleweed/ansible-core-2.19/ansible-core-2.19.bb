SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple IT automation system. It handles configuration \
management, application deployment, cloud provisioning, ad-hoc task execution, \
network automation, and multi-node orchestration. Ansible makes complex changes \
like zero-downtime rolling updates with load balancers easy. More information \
on the Ansible website <https://ansible.com/>."
LICENSE = "GPL-3.0-or-later"

PV = "2.19.12"

RPM_NAME = "ansible-core-2.19-2.19.12-1.1.noarch.rpm"
RPM_HASH = "f3365af008f9402c01a1ec6cc79955420ee2050b58aa9015e33b8b139bce9b0be9a5c60b3bee2c01c3e3b8207bb42f5158a606e662682be8dcd6ad49f4f71a44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-core \
ansible-core-2.19 \
python3.13dist-ansible-core \
python3dist-ansible-core"

RDEPENDS:${PN} += "-python3-resolvelib >= 0.5.3 with python3-resolvelib < 2.0.0 \
/usr/bin/python3.13 \
python-abi \
python3-Jinja2 \
python3-PyYAML \
python3-cryptography \
python3-packaging \
python3-rpm"

inherit rpm
