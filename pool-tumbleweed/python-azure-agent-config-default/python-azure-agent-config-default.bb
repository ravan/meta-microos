SUMMARY = "Default upstream configuration"
DESCRIPTION = "The default configuration for the agent as supplied by upstream for SUSE"
LICENSE = "Apache-2.0"

PV = "2.14.0.1"

RPM_NAME = "python-azure-agent-config-default-2.14.0.1-2.1.noarch.rpm"
RPM_HASH = "3a3a2adc46f0968ade3e713b41a4db4890d15e5a35a3041fd0270dc49555b789059a68c80e9f1735657a4fcb6a7abdada400a04ec043836de8a24faac90ea755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python-azure-agent-config-default \
python-azure-agent-config-default \
waagent-config"

RDEPENDS:${PN} += "/usr/bin/sh \
python-azure-agent"

inherit rpm
