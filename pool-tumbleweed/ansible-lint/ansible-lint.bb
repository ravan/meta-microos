SUMMARY = "Best practices checker for Ansible"
DESCRIPTION = "Checks playbooks for practices and behavior that could potentially be improved."
LICENSE = "MIT"

PV = "26.8.0"

RPM_NAME = "ansible-lint-26.8.0-1.1.noarch.rpm"
RPM_HASH = "18cc7277c2239bdd8c7adf51c9000f18a356dbbf666cf125c2c233d5fcf9bf06049a665a9400a6558903953e58ab30c3c923b5987730eb4c29752d7726db3d4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-lint \
python3.13dist-ansible-lint \
python3dist-ansible-lint"

RDEPENDS:${PN} += "-python3-pathspec >= 1.0.3 with python3-pathspec < 1.2.0 \
/usr/bin/python3.13 \
ansible-core \
python-abi \
python3-PyYAML \
python3-ansible-compat \
python3-black \
python3-cffi \
python3-cryptography \
python3-filelock \
python3-importlib-metadata \
python3-jsonschema \
python3-packaging \
python3-referencing \
python3-ruamel.yaml \
python3-ruamel.yaml.clib \
python3-subprocess-tee \
python3-wcmatch \
python3-yamllint"

inherit rpm
