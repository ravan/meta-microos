SUMMARY = "Data for the xonotic first person shooter"
DESCRIPTION = "Fast-paced first-person shooter. It provides arena shooter gameplay \
and is a direct successor of the Nexuiz project. \
 \
This subpackage contains data (textures, maps, sounds and models) \
required to play xonotic."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "xonotic-data-0.8.6-6.8.noarch.rpm"
RPM_HASH = "b6f8eb8fad4bdafb3d3567d9a9731e6bf7376ba32793bc09c12919ed75b6fb6341b7d807d8a2519a2f3a47595f7923b9d989889c1c23913515ffd63f834bcff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xonotic-data"

RDEPENDS:${PN} += ""

inherit rpm
