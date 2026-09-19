SUMMARY = "Ansible development and testing tools"
DESCRIPTION = "Development and testing tools for Ansible content creation. Includes \
ansible-lint for playbook linting, molecule for role testing, \
ansible-navigator TUI, ansible-builder for execution environments, \
ansible-runner for programmatic execution, and ansible-creator for \
scaffolding new content."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "patterns-ansible-devtools-1.0.0-2.2.noarch.rpm"
RPM_HASH = "8c5fc84d6549f76b697f1e45c13679f37d896cd0accc9f547c48a3a45918147e2c743d3767ba8943bb7c8d03763fa2a30c10c839541afcf34fa3e2a30152a916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-ansible-devtools"

RDEPENDS:${PN} += "ansible-builder \
ansible-creator \
ansible-lint \
ansible-navigator \
ansible-runner \
molecule \
pattern-"

inherit rpm
