SUMMARY = "Jira plugin for md2workflow"
DESCRIPTION = "Jira plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python314-md2workflow-plugins-jira-1.4.18-6.5.noarch.rpm"
RPM_HASH = "9f79d968e0da780d5a07393196222ae2d5f0fa9c28d20a871f1d36f0a83f522bf00b24fd4bd80056123ab28b0382b27f6f481db5b4a2b841233da90c17cd9beb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-md2workflow-plugins-jira"

RDEPENDS:${PN} += "python-abi \
python314-jira \
python314-md2workflow"

inherit rpm
