SUMMARY = "Jira plugin for md2workflow"
DESCRIPTION = "Jira plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python313-md2workflow-plugins-jira-1.4.18-6.5.noarch.rpm"
RPM_HASH = "82c66bbd77dadd97f772cb21f5c787abd418d380fcceba72081c4a65d6d35b7956feaed03ac1ff5f647291e689a64e8397f63831ac8311e5668de924df8beaa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-md2workflow-plugins-jira \
python313-md2workflow-plugins-jira"

RDEPENDS:${PN} += "python-abi \
python313-jira \
python313-md2workflow"

inherit rpm
