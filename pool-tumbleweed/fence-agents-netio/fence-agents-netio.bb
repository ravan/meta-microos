SUMMARY = "Fence agent for Koukaam NETIO devices"
DESCRIPTION = "Fence agent for Koukaam NETIO devices that are accessed \
via telnet or SSH."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-netio-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "83cb5184435b771be143b03a9e76a1e77e08d4281b63b2cca47d7b7101a0fe12b97c4caa62d5c328a08899c4de868ed3be4d1d499ea36bb579471d9b388f0352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-netio"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
openssh-clients"

inherit rpm
