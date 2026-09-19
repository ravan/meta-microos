SUMMARY = "Tool to show origin of Ansible host context variables"
DESCRIPTION = "The Ansible inventory is a framework for declaring variables in a \
hierarchical manner. There a lot of different places where a variable \
can be defined. ansible-variables displays where host context \
variables originate from."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "ansible-variables-0.9.1-2.3.noarch.rpm"
RPM_HASH = "2e5cb7f9a947d063356343e7a7fe7795f00c1d1bf4806b7ec9c1e57af3218cc82bd5f90e9d454485d0fc55849724f9751c52e0cbf75ad3610306b9c00aa10a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-variables \
python3.13dist-ansible-variables \
python3dist-ansible-variables"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ansible-core-2.18 \
python-abi \
python3-rich \
update-alternatives"

inherit rpm
