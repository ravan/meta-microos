SUMMARY = "Fence agent for IBM RSA II"
DESCRIPTION = "Fence agent for IBM RSA II devices that are accessed \
via telnet or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-rsa-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "aa4a9b61d28a675a07d2a2f1076c2fbad6a4d445b795ee8279d73538f29e944e7c2d19b48f47be478085999c516ad98cb393f49a3cc55226f20025a0d054eb39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-rsa"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm
