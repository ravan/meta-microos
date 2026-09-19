SUMMARY = "Military stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-military package contains a set of 'Rubber Stamp' \
images which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-military-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "7b81ac251fc211109f7581854e520de374d4f9cadf3df61bc2b22b5bf016dba77dc281853e67d997edb8261ca905a8fc348f0efae2acdba692b6d734d0f098ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-military"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
