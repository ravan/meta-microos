SUMMARY = "Fence agent for Dell DRAC 5"
DESCRIPTION = "Fence agent for Dell DRAC 5 series devices that are accessed \
via telnet or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-drac5-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "0c5f9a4290676e27a5622ec830b7270372bef11243aa3b02b654d97e6a098c338d2ba3c52d3a0b79ca6b7c891fa575345727e16bec814661f79dc1c2ca2996b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-drac5"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm
