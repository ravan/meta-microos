SUMMARY = "Library for encoding variable length integer data"
DESCRIPTION = "varints are a common encoding for variable length integer data, \
used in libraries such as sqlite, protobuf, v8, and more."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python314-varint-1.0.2-2.5.noarch.rpm"
RPM_HASH = "cd2debe6c90703d38b2efee3658c097de1a3fb0b0cf22d3b579020acb6aa7353713535bd122e4c765fc2672160f3bb7f6e05a73ed901b651569469fb53b9edae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-varint \
python314-varint \
python3dist-varint"

RDEPENDS:${PN} += "python-abi"

inherit rpm
