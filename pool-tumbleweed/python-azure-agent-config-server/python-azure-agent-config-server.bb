SUMMARY = "SUSE specific configuration for server products"
DESCRIPTION = "Modified waagent.conf file to meet SUSE policies and SUSE image build \
setup"
LICENSE = "Apache-2.0"

PV = "2.14.0.1"

RPM_NAME = "python-azure-agent-config-server-2.14.0.1-2.1.noarch.rpm"
RPM_HASH = "cf8e270af89d5badd00c1d2e0830cac3942fcca20f9fe01ec07574a0e4ab210301285e6a014c995bf2ece661b66e098a845e7e0506428007c9d06e20460b87d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python-azure-agent-config-server \
python-azure-agent-config-server \
waagent-config"

RDEPENDS:${PN} += "/usr/bin/sh \
python-azure-agent"

inherit rpm
