SUMMARY = "A text-based user interface (TUI) for Ansible"
DESCRIPTION = "A text-based user interface (TUI) for Ansible. \
 \
When running ansible-navigator with no arguments, you will be presented with the welcome page. From this page, you can run playbooks, browse collections, explore inventories, read Ansible documentation, and more. \
 \
A full list of key bindings can be viewed by typing :help."
LICENSE = "Apache-2.0"

PV = "26.8.0"

RPM_NAME = "ansible-navigator-26.8.0-1.1.noarch.rpm"
RPM_HASH = "28a7a19df88a5890965dc1ed4c7225b3534ce04606434a82132a89d4c521ffb3b14b7af23a44f86f909b7d25fa3d656795eed8df74c330cfb44ab9eeb1e35514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-navigator \
python3.13dist-ansible-navigator \
python3dist-ansible-navigator"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
ansible-builder \
ansible-core \
ansible-lint \
ansible-runner \
python-abi \
python3-Jinja2 \
python3-PyYAML \
python3-curses \
python3-jsonschema \
python3-onigurumacffi \
python3-pytzdata \
python3-setuptools"

inherit rpm
