SUMMARY = "Ansible filters, tests and utility functions for moban users"
DESCRIPTION = "Ansible filters, tests and utility functions for moban users"
LICENSE = "BSD-3-Clause"

PV = "0.0.2"

RPM_NAME = "python314-moban-ansible-0.0.2-3.5.noarch.rpm"
RPM_HASH = "b864581d1d5e9b46f9154710b21e3707f92add9f4182de459245cf63bf79d9913216e793b0fbbf31117c73da852c3118cae824ccf951b30c8fbc1faaf3fbaa1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-moban-ansible \
python314-moban-ansible \
python3dist-moban-ansible"

RDEPENDS:${PN} += "python-abi \
python314-moban"

inherit rpm
