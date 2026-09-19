SUMMARY = "Fence agent for VMWare with REST API"
DESCRIPTION = "Fence agent for VMWare with REST API."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-vmware-rest-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "52868d74757950ed2e4513986938e0a24e3f74f58ba60061fd80e59124becf2190f0a33acb938aa6965558c5b4f76d9998c0b5632d852a9716f21b7a1b560000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-vmware-rest"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common"

inherit rpm
