SUMMARY = "GAP: Computing with crystallographic groups"
DESCRIPTION = "Cryst provides a rich set of methods to compute with affine \
crystallographic groups, in particular space groups. Affine \
crystallographic groups are fully supported both in the \
representation acting from the right and in the representation acting \
from the left. The latter representation is the one preferred by \
crystallographers. There are also functions to determine \
representatives of all space group types of a given dimension."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.32"

RPM_NAME = "gap-cryst-4.1.32-1.1.noarch.rpm"
RPM_HASH = "b3a3da1dee56ce9b77de431cc11a50b004e3f93c57118374107d2fb07b9c94e2e95a0a9fbe36c8587bb724ac4b028c8c143d169d993bfca3d56082e65346e555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-cryst"

RDEPENDS:${PN} += "gap-core \
gap-polenta \
gap-polycyclic"

inherit rpm
