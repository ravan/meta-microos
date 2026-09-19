SUMMARY = "Fence agent for Emerson devices (SNMP)"
DESCRIPTION = "Fence agent for Emerson devices that are accessed via \
the SNMP protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-emerson-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "fcad651457372d47b7447d52e4c7c46c91978344774333d5be0a49506ed7988a0dac92aedb4f0fa155ca0ba2b9bf33f0df137b5acb46911163f96306aa2e53f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-emerson"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common"

inherit rpm
