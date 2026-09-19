SUMMARY = "SUSE specific configuration for Micro"
DESCRIPTION = "Modified waagent.conf file to meet SUSE policies and SUSE image build \
setup"
LICENSE = "Apache-2.0"

PV = "2.14.0.1"

RPM_NAME = "python-azure-agent-config-micro-2.14.0.1-2.1.noarch.rpm"
RPM_HASH = "bf02a5ff3c1a8b7153ea2cfa002e4dcc5df4138fef3eac293f0746d2583d3cf8c56d29428622208ed4315f6ded5c46f7e3e02266818841bfa58822b8a255faff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python-azure-agent-config-micro \
python-azure-agent-config-micro \
waagent-config"

RDEPENDS:${PN} += "/usr/bin/sh \
python-azure-agent"

inherit rpm
