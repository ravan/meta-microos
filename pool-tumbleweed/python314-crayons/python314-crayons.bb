SUMMARY = "Colored strings for terminal usage"
DESCRIPTION = "Crayons is a simple module to give you colored strings for terminal usage. \
Included colors are red, green, yellow, blue, black, magenta, cyan, white, \
and normal."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-crayons-0.4.0-4.5.noarch.rpm"
RPM_HASH = "5ccb2c7e53635d9275727bfd2526bf65edee536394e01ea6e7d520b880f40a8532fc2c99f5f2b14b77765cd665dee80c28acb47e45f3abb7a40d1ae61de32568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-crayons \
python314-crayons \
python3dist-crayons"

RDEPENDS:${PN} += "python-abi \
python314-colorama"

inherit rpm
