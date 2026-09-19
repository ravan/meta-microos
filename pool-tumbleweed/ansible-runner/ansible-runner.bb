SUMMARY = "Run ansible-playbook inside an execution environment"
DESCRIPTION = "Consistent Ansible Python API and CLI with container and process isolation runtime capabilities"
LICENSE = "Apache-2.0"

PV = "2.4.3"

RPM_NAME = "ansible-runner-2.4.3-1.2.noarch.rpm"
RPM_HASH = "06fa8955dce2803ed6cbd2894be02f5c9ee40035bada2578ec044507d225b79bce003e70a9a7402dac388f4ee03872ddc36dfaabd5b82f6bcd542522614e4287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-runner \
python3.13dist-ansible-runner \
python3dist-ansible-runner"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-packaging \
python3-pexpect \
python3-python-daemon"

inherit rpm
