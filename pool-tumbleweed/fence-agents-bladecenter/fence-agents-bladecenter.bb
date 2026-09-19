SUMMARY = "Fence agent for IBM BladeCenter"
DESCRIPTION = "Fence agent for IBM BladeCenter devices that are accessed \
via telnet or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-bladecenter-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "b521bb9f63929bcc3d7648079cc0f346025f3fbbdca028f73194950aaa0301678fb10f8b53e1c0fe7b96ca45978d48fe29a26d13345ad23584d95eb837f55c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-bladecenter"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm
