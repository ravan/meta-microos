SUMMARY = "SUSE specific configuration for HPC"
DESCRIPTION = "Modified waagent.conf file to meet SUSE policies and SUSE image build \
setup"
LICENSE = "Apache-2.0"

PV = "2.14.0.1"

RPM_NAME = "python-azure-agent-config-hpc-2.14.0.1-2.1.noarch.rpm"
RPM_HASH = "9b46535c7314d041c56bdf9dad150092353a09603794a3d33c7e4124af201284853c4324e3f0e264190fa3edef2d29ea5880d78c640cef07838920d5197dd31a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python-azure-agent-config-hpc \
python-azure-agent-config-hpc \
waagent-config"

RDEPENDS:${PN} += "/usr/bin/sh \
python-azure-agent"

inherit rpm
