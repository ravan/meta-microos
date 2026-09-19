SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple IT automation system. It handles configuration \
management, application deployment, cloud provisioning, ad-hoc task execution, \
network automation, and multi-node orchestration. Ansible makes complex changes \
like zero-downtime rolling updates with load balancers easy. More information \
on the Ansible website <https://ansible.com/>."
LICENSE = "GPL-3.0-or-later"

PV = "2.20.8"

RPM_NAME = "ansible-core-2.20-2.20.8-1.1.noarch.rpm"
RPM_HASH = "5cf27af804e93fee3ddc3ae975a369189614afc98bcb54c075e5985f4bee83b98f5c37330c161831eac3c5df40bd36b7f970248a65a7ccd750fb77561b9ff352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-core \
ansible-core-2.20 \
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
