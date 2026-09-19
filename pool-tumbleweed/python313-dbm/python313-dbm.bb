SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.13.14"

RPM_NAME = "python313-dbm-3.13.14-2.1.aarch64.rpm"
RPM_HASH = "a7e9404af8359ee315e5f326e1b8dddd1c8b0960a391708d0cdc8cf77e364cceb1b658f17677e0a490a1999901f3336a99512fd35e1c3f12eee47543bc9a51f2"

RPROVIDES:${PN} += "python3-dbm \
python313-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python313"

inherit rpm
