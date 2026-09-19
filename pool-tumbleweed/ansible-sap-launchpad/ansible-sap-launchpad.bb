SUMMARY = "Ansible collection community.sap_launchpad for SAP Automation"
DESCRIPTION = "This package provides a Ansible collection community.sap_launchpad. \
 \
It automates download of SAP Software for SAP installations. \
Downloads software using list of files or maintenance plan ID."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "ansible-sap-launchpad-1.3.2-1.2.noarch.rpm"
RPM_HASH = "42d6e834c86f0ceec26be43c783bcc90c29a491366f05ac6b18a3761bc8036efc9f6129998b88b30f6a5314a0e219f3c63ab63005c19f47b3da80898b96af2f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-sap-launchpad"

RDEPENDS:${PN} += "ansible \
ansible-core"

inherit rpm
