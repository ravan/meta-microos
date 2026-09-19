SUMMARY = "Library implementing a mutable variant of namedtuple"
DESCRIPTION = "Mutable variant of namedtuple -- recordclass, which support assignments, and \
other memory saving variants."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python313-recordclass-0.24-1.6.aarch64.rpm"
RPM_HASH = "f24a33fcd94e6327679345a42ac407062762f3fd41fdeb8201ce9a410c3294d6f736393a440b5cef8c3bee1745c5c81609b638a735fa28909c8da0d6a8b583e7"

RPROVIDES:${PN} += "python3-recordclass \
python3.13dist-recordclass \
python313-recordclass \
python3dist-recordclass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
