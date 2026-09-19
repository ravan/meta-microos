SUMMARY = "Ansible Playbooks for SAP Automation"
DESCRIPTION = "This package provides a collection of Ansible Playbooks for SAP Automation,  designed to automate the setup and configuration of SAP environments. \
 \
The playbooks are installed in the following directory: /usr/share/ansible/playbooks/ansible.playbooks_for_sap/ \
 \
IMPORTANT: Do not modify the playbooks in this directory directly. Any changes will be overwritten by future package updates (zypper up). \
Instead, copy the playbooks to a different location before customizing or using them. \
 \
It is highly recommended to read the README file in the installation directory to understand the functionality and proper usage of the playbooks."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "ansible-sap-playbooks-1.4.0-1.2.noarch.rpm"
RPM_HASH = "097b18c35a8620dbe4f5823ec18312bb0b981d59cb33a251a11499716ae350512c82b6dff2a9989ddbf402840ce564ceac52c8c52f51b74a80d19d16b5a8a8ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-sap-playbooks"

RDEPENDS:${PN} += "ansible \
ansible-core \
ansible-sap-infrastructure \
ansible-sap-install \
ansible-sap-operations"

inherit rpm
