SUMMARY = "Ansible filters, tests and utility functions for moban users"
DESCRIPTION = "Ansible filters, tests and utility functions for moban users"
LICENSE = "BSD-3-Clause"

PV = "0.0.2"

RPM_NAME = "python313-moban-ansible-0.0.2-3.5.noarch.rpm"
RPM_HASH = "5cc2ed72122bd2fedc467ee031a70a66f8866b8460f626e4ff179f95c68c2b9bc43338e3622ba9c6bfbd1561c962992317d63bbaba7dea7755d8aa9c931c8f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moban-ansible \
python3.13dist-moban-ansible \
python313-moban-ansible \
python3dist-moban-ansible"

RDEPENDS:${PN} += "python-abi \
python313-moban"

inherit rpm
