SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple IT automation system. It handles configuration \
management, application deployment, cloud provisioning, ad-hoc task execution, \
network automation, and multi-node orchestration. Ansible makes complex changes \
like zero-downtime rolling updates with load balancers easy. More information \
on the Ansible website <https://ansible.com/>."
LICENSE = "GPL-3.0-or-later"

PV = "2.21.3"

RPM_NAME = "ansible-core-2.21.3-1.1.noarch.rpm"
RPM_HASH = "74e4465eab486708cd529425a6674888745fec7e3b03f82dbfaa5597915ab24187ece297ca19fba0196cfed1b26f9d2450b007c1bcfe22996cd3091ecd265739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-core \
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
