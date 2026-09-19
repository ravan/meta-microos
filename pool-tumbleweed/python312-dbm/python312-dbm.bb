SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.12.14"

RPM_NAME = "python312-dbm-3.12.14-1.1.aarch64.rpm"
RPM_HASH = "3861c8971a1c1298ecd17e6c49e893bfff6e037afb158b2f51a66d3c7c082d03c25613f473d7f50518f6772122a7f0d1895c346f7c3bcfc54354a295fc75a90e"

RPROVIDES:${PN} += "python312-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python312"

inherit rpm
