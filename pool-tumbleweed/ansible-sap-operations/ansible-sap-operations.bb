SUMMARY = "Ansible collection suse.sap_operations for SAP Automation"
DESCRIPTION = "This package provides a Ansible collection suse.sap_operations. \
 \
It automates suite of day to day operations for existing SAP landscape."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "ansible-sap-operations-2.0.0-1.2.noarch.rpm"
RPM_HASH = "b8d5e11d067a47dd33b51cf2a4a4bea9dceaa349bf12ca88d8e5976c2983538286219a1badd27fbe476e68d475d9455eb156a3f9ed0fabebaa2a10581cc2ce81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-sap-operations"

RDEPENDS:${PN} += "/usr/bin/sh \
ansible \
ansible-core"

inherit rpm
