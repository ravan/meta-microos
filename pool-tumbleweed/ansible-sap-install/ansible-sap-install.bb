SUMMARY = "Ansible collection suse.sap_install for SAP Automation"
DESCRIPTION = "This package provides a Ansible collection suse.sap_install. \
 \
It automates the installation of various SAP software components, \
 including SAP HANA, SAP NetWeaver, and SAP S/4HANA. \
 \
This collection can be used to simplify and accelerate the deployment, \
management, and operation of SAP systems on Linux platforms."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "ansible-sap-install-1.9.2-1.2.noarch.rpm"
RPM_HASH = "fd5b916455a5aa0c8802946e411212534da19bbec378ad76cdb49586ff9504a4afa7a6d8ecc2912823ab7a5ca4e11c5184c0ffbd4d4c9a72f0a3c33d1cd9432a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-sap-install"

RDEPENDS:${PN} += "/usr/bin/sh \
ansible \
ansible-core \
ansible-linux-system-roles"

inherit rpm
