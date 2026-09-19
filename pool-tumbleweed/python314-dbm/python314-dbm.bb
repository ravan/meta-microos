SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.14.7"

RPM_NAME = "python314-dbm-3.14.7-1.1.aarch64.rpm"
RPM_HASH = "4aa4f807e6238941b114b66113df50a09d2720ff39a31f481dcfda0badf9901e78f3834462e3b7763eb713cb2a5fe92eefda7cf02c667b6a4012ce569ea8bbd3"

RPROVIDES:${PN} += "python314-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python314"

inherit rpm
