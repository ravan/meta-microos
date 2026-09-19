SUMMARY = "Ansible collection suse.sap_infrastructure for SAP Automation"
DESCRIPTION = "This package provides a Ansible collection suse.sap_infrastructure. \
 \
It automates the provisioning of SAP infrastructure across various platforms: \
- AWS EC2 Virtual Server instances \
- Google Cloud Compute Engine Virtual Machines \
- IBM Cloud, Intel Virtual Servers \
- IBM Cloud, Power Virtual Servers \
- Microsoft Azure Virtual Machines \
- IBM PowerVM Virtual Machines \
 \
Ensure that you install all required packages, python modules and collections. \
https://github.com/SUSE/community.sap_infrastructure/tree/main/roles/sap_vm_provision#requirements \
 \
Package and collection dependencies are not installed along with this package!"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "ansible-sap-infrastructure-1.4.0-1.2.noarch.rpm"
RPM_HASH = "88cd2f93a6c93dba3c61e72d8f8ad29b89c1e3ec9f464df68308495d0854261882d31f9d6987f5ade844114910a95f6eae1f2afc1774f385b281a4ac2a61f758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-sap-infrastructure"

RDEPENDS:${PN} += "/usr/bin/sh \
ansible \
ansible-core"

inherit rpm
