SUMMARY = "A Boost Make Replacement"
DESCRIPTION = "Boost Jam is a build tool based on FTJam, which in turn is based on \
Perforce Jam. It contains significant improvements made to facilitate \
its use in the Boost Build System. \
 \
This package installs the default version of Boost Jam."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "boost-jam-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "69d60f8fc49264efe057e28bcb9c30bf89da8379ecd9c3931c967a521b5d4c91970dbc4a41f8e63062fc20645f7bd64c6497be74a87011972b504d5a2d8e7a3f"

RPROVIDES:${PN} += "boost-jam"

RDEPENDS:${PN} += "boost1-91-0-jam"

inherit rpm
