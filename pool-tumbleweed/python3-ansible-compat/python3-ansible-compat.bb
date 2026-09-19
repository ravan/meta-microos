SUMMARY = "Compatibility shim for Ansible 2.9 and newer"
DESCRIPTION = "Facilitate working with various versions of Ansible 2.9 and newer."
LICENSE = "MIT"

PV = "26.8.0"

RPM_NAME = "python3-ansible-compat-26.8.0-1.1.noarch.rpm"
RPM_HASH = "1515409172d5f9a98051b544c5b131db4caad31de64f16f4e944fa23e4460239d756ea9f4580280d3efcffc997e0f5db5fc454fa545aef6fcb437e493307571e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansible-compat \
python3.13dist-ansible-compat \
python3dist-ansible-compat"

RDEPENDS:${PN} += "ansible-core \
python-abi \
python3-PyYAML \
python3-jsonschema \
python3-packaging \
python3-subprocess-tee \
python3.13dist-jsonschema \
python3.13dist-packaging \
python3.13dist-pyyaml \
python3.13dist-subprocess-tee"

inherit rpm
