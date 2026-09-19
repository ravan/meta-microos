SUMMARY = "Documentation for OpenStack i18n library"
DESCRIPTION = "Documentation for the oslo.i18n library."
LICENSE = "Apache-2.0"

PV = "6.9.0"

RPM_NAME = "python-oslo.i18n-doc-6.9.0-1.1.noarch.rpm"
RPM_HASH = "c7b6ca116dbb75da17cced506d798418a14e060cb14721dae2134765b34e538a5f50879d5e9e1034db15c384555786eefa726260b794ffba2fca24f3757c7550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.i18n-doc"

RDEPENDS:${PN} += ""

inherit rpm
