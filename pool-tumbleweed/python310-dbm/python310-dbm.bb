SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.10.21"

RPM_NAME = "python310-dbm-3.10.21-1.1.aarch64.rpm"
RPM_HASH = "3a012f05d277af2e2984b89ba1053d769ea4f054b19640c7fc5fd13288ba81330ba8b5e2d02b96c06feef3969cfa81157dab2aa21c8bb0966f5a038652da6633"

RPROVIDES:${PN} += "python310-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python310"

inherit rpm
