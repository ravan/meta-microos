SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple IT automation system. It handles configuration \
management, application deployment, cloud provisioning, ad-hoc task execution, \
network automation, and multi-node orchestration. Ansible makes complex changes \
like zero-downtime rolling updates with load balancers easy. More information \
on the Ansible website <https://ansible.com/>."
LICENSE = "GPL-3.0-or-later"

PV = "2.18.19"

RPM_NAME = "ansible-core-2.18-2.18.19-1.1.noarch.rpm"
RPM_HASH = "2e850d1137ec55d93ab87e54f2aa07a263fb033a5f55cc888139337a13d3c620ccd632523db34908dfb1aebc299db15f7b0bb44043d766edcc930757bb20aa6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-core \
ansible-core-2.18 \
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
