SUMMARY = "Fence agent for Eaton network power switches"
DESCRIPTION = "Fence agent for Eaton network power switches that are accessed \
via the SNMP protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-eaton-snmp-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "1af0eea75e6a0c688883d1116ca502b05c057ffa5a52b99c35fdfdabbafc46475a9bea2247876022d4eea659a19e6b78d1918471242fab1be8f85b393f38c76c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-eaton-snmp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
net-snmp"

inherit rpm
