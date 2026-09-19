SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python313-napalm-5.1.0-1.4.noarch.rpm"
RPM_HASH = "4bc80180b0884d7e32704a239819babab7368fa23f50cd2c78f106a297aa3920d0d04fdfebf2cd1b4005c7533337f252c7eac7c2825198bb000dc6437af4fbc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm \
python3.13dist-napalm \
python313-napalm \
python3dist-napalm"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Jinja2 \
python313-PyYAML \
python313-cffi \
python313-junos-eznc \
python313-lxml \
python313-ncclient \
python313-netaddr \
python313-netmiko \
python313-netutils \
python313-paramiko \
python313-pyeapi \
python313-requests \
python313-scp \
python313-setuptools \
python313-textfsm \
python313-ttp \
python313-ttp-templates \
python313-typing-extensions \
update-alternatives"

inherit rpm
