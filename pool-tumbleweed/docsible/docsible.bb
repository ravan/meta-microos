SUMMARY = "Auto documentation for Ansible roles and collections"
DESCRIPTION = "Docsible is a command-line interface (CLI) written in Python that automates the \
documentation of Ansible roles and collections. It generates a \
Markdown-formatted README file for role or collection by scanning the Ansible \
YAML files."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "docsible-0.8.0-1.4.noarch.rpm"
RPM_HASH = "05095fe0ff3e90a7931fab7071e2c72b2ad88fa5c9d386b445be0ea1c7ff4e949fe562ea8b94fe92cbb1e8426dd00f8327128eef36c8197dc2220324ce271c1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docsible \
python3.13dist-docsible \
python3dist-docsible"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-Jinja2 \
python3-PyYAML \
python3-click \
update-alternatives"

inherit rpm
