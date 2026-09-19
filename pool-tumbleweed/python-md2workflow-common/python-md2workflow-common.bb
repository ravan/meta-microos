SUMMARY = "Configuration and examples for md2workflow"
DESCRIPTION = "Configuration and examples for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python-md2workflow-common-1.4.18-6.5.noarch.rpm"
RPM_HASH = "8231b04c9032eaf3265fbe8e9b433f476aef0499d7ede993ecc252ad1f1aa00ddec6276c175dd0850fed0749f30b5eaac08f5834d1dd636d504488d4b66aea69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python-md2workflow-common \
python-md2workflow-common \
python313-md2workflow-common \
python314-md2workflow-common"

RDEPENDS:${PN} += ""

inherit rpm
