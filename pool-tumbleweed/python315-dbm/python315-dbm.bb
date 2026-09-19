SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.15.0~rc2"

RPM_NAME = "python315-dbm-3.15.0~rc2-1.1.aarch64.rpm"
RPM_HASH = "18ab2b2d44ad1402fb1ec26e24f7d93ce820c0648a74b33e3bb5f31d5591317f3f2aaac4bd808e080b5c4c553041e9529cb83f2aaf00815d849c53ba1b794c5e"

RPROVIDES:${PN} += "python315-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python315"

inherit rpm
