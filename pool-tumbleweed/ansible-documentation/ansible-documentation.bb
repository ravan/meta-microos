SUMMARY = "Ansible community documentation and example files"
DESCRIPTION = "User documentation and example files related to the Ansible package and Ansible core."
LICENSE = "GPL-3.0-only"

PV = "2.21.3"

RPM_NAME = "ansible-documentation-2.21.3-1.1.noarch.rpm"
RPM_HASH = "1ffe9d81ce3d2ece8bd5c259966d6b0c77a04e687b582bd794dc2066635aea5e192b58d608990e83b812a4ac867ac71083818199b5ec21847d39729282e8548d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-documentation \
config-ansible-documentation"

RDEPENDS:${PN} += "ansible-core"

inherit rpm
