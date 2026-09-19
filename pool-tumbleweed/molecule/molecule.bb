SUMMARY = "Aids in the development and testing of Ansible roles"
DESCRIPTION = "Molecule project is designed to aid in the development and testing of \
Ansible roles. \
 \
Molecule provides support for testing with multiple instances, operating \
systems and distributions, virtualization providers, test frameworks and \
testing scenarios."
LICENSE = "MIT"

PV = "26.8.0"

RPM_NAME = "molecule-26.8.0-1.1.noarch.rpm"
RPM_HASH = "f114ebf0ff91ac03d8a3d7b451cd1bc6dd060fde52056a9dcf59a2b03952653dcfcf9d4994f95e7007124e91e040b5198b34b496cfd7afb50382ffb5adcf7041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "molecule \
python3.13dist-molecule \
python3dist-molecule"

RDEPENDS:${PN} += "-python3-click >= 8.0 with python3-click < 9 \
-python3-pluggy >= 0.7.1 with python3-pluggy < 2.0 \
/usr/bin/python3.13 \
ansible-core \
python-abi \
python3-Jinja2 \
python3-PyYAML \
python3-ansible-compat \
python3-base \
python3-enrich \
python3-jsonschema \
python3-packaging \
python3-rich \
python3-wcmatch"

inherit rpm
