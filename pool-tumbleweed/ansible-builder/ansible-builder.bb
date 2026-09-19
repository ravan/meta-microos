SUMMARY = "An Ansible execution environment builder"
DESCRIPTION = "Ansible Builder is a tool that automates the process of \
building execution environments using the schemas and \
tooling defined in various Ansible Collections and by \
the user. \
 \
See the readthedocs page for ansible-builder at: \
https://ansible-builder.readthedocs.io/en/latest/"
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "ansible-builder-3.1.1-2.3.noarch.rpm"
RPM_HASH = "360297a82f08d22231dcdddefece334d32e0d4088d3876976a33721270ae3e7f57857818c37c84d08f94e29bc36e7e2e697afbbac6a15f1a8daf7d0821f2e135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-builder \
python3.13dist-ansible-builder \
python3dist-ansible-builder"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-bindep \
python3-jsonschema \
python3-packaging"

inherit rpm
