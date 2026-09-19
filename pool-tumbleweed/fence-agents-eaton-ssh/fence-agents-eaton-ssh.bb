SUMMARY = "Fence agent for Eaton network power switches"
DESCRIPTION = "Fence agent for Eaton network power switches that are accessed \
via the serial protocol tunnel over SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-eaton-ssh-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "770f95157a02067b14c2cc026e5ec7d67b8880edc6f93d5ca13bc4f1046c8b329da6fafe63d47bf55ae7ed32334506824e25c087d0fde757c81bdf7307761b3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-eaton-ssh"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common"

inherit rpm
