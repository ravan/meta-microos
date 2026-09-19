SUMMARY = "Python3 bindings for the Tdb library"
DESCRIPTION = "This package contains the Python3 bindings for the Tdb library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.15"

RPM_NAME = "python3-tdb-1.4.15-1.3.aarch64.rpm"
RPM_HASH = "d4136845390d0e582e78fdc0a9f0edb989a66091b082b5ce5c9d21bbbc210ec95c99369e3cfc1c0b768032f4b2b12b84342559c6d6573cce6d07573bf5b5d4ff"

RPROVIDES:${PN} += "python3-tdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtdb.so.1 \
libtdb1 \
python-abi"

inherit rpm
