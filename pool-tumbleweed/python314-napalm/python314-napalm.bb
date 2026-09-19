SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python314-napalm-5.1.0-1.4.noarch.rpm"
RPM_HASH = "a7bc9f3aa83c22e0e3954e7d9473e2b6974eefc62ae9829c84f4cc88d25dd9ebc4dd2759e8432e2483f382a9bb3e2a1c7c5067f4f47178e3cd77465aac8b47d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-napalm \
python314-napalm \
python3dist-napalm"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Jinja2 \
python314-PyYAML \
python314-cffi \
python314-junos-eznc \
python314-lxml \
python314-ncclient \
python314-netaddr \
python314-netmiko \
python314-netutils \
python314-paramiko \
python314-pyeapi \
python314-requests \
python314-scp \
python314-setuptools \
python314-textfsm \
python314-ttp \
python314-ttp-templates \
python314-typing-extensions \
update-alternatives"

inherit rpm
