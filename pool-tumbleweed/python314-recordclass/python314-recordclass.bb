SUMMARY = "Library implementing a mutable variant of namedtuple"
DESCRIPTION = "Mutable variant of namedtuple -- recordclass, which support assignments, and \
other memory saving variants."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python314-recordclass-0.24-1.6.aarch64.rpm"
RPM_HASH = "8f15a25d8b0f3daf37b9a58a3079fe4eefec7fc2e3b82ac98ff8bfe56ca6e023deff8b700ed4c58081f576b8673b0176921a98a30a3f1f4bc76df84a83ce70c5"

RPROVIDES:${PN} += "python3.14dist-recordclass \
python314-recordclass \
python3dist-recordclass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
