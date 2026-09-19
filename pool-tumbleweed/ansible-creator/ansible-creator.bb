SUMMARY = "A CLI tool for scaffolding Ansible Content"
DESCRIPTION = "Ansible Creator is a CLI tool for scaffolding Ansible content. \
It provides commands to initialize new Ansible projects and add \
resources to existing ones, including collections, playbook \
projects, and execution environments. \
 \
See the documentation at: \
https://ansible.readthedocs.io/projects/creator/"
LICENSE = "Apache-2.0"

PV = "26.8.0"

RPM_NAME = "ansible-creator-26.8.0-1.1.noarch.rpm"
RPM_HASH = "7b63707b11dc9cbaf596518fabd5c5dc8673771b20a83b104aed3f0c23c8ced174d5052c162a155cffc49cb822c4c31a29a8cb5d8bfe4635dde3fcc72b6bcf29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-creator \
python3.13dist-ansible-creator \
python3dist-ansible-creator"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Jinja2 \
python3-PyYAML"

inherit rpm
