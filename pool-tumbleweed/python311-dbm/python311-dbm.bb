SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.11.16"

RPM_NAME = "python311-dbm-3.11.16-1.1.aarch64.rpm"
RPM_HASH = "33e6ea194ea9cbb398b16c6aafd743901f00b3e00171b918cb1dfd9f0eda9788b9ddb973d6dbc13510635a3bc366e8d58220b4d735bdde0f09047102a8e84dcf"

RPROVIDES:${PN} += "python311-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python311"

inherit rpm
