SUMMARY = "Fence agent for Cisco UCS series"
DESCRIPTION = "Fence agent for Cisco UCS series devices that are accessed \
via the SNMP protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-cisco-ucs-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "5c6cae58a30c5057bd3fca79e36ac9c5e631d27c13106095f43b9d94e68ff3ee9fd5c59bc8baf2c33f2595af2058959f810df6a071dada1028ef3a5c67b9aa11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-cisco-ucs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
python3-pycurl"

inherit rpm
