SUMMARY = "Fence agent for Cisco MDS 9000 series"
DESCRIPTION = "Fence agent for Cisco MDS 9000 series devices that are accessed \
via the SNMP protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-cisco-mds-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "27d0bc2c97de1d57599499fe738e73f2958bc64ad3781eaeebf9e4b37bb7f7f328025bf3319074817a0fb7e28d36a4ac2b703e25e4ee5d32ccc7ef4a107fb925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-cisco-mds"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
net-snmp"

inherit rpm
