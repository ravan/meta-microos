SUMMARY = "Python bindings for libhivex"
DESCRIPTION = "This subpackage contains the Python bindings for hivex. \
Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.24"

RPM_NAME = "python3-hivex-1.3.24-3.3.aarch64.rpm"
RPM_HASH = "1cf210560e491e7f296f24bfc4be72fb86b55b1b4d44c03450dc5b6046392e108b734c15a976efc365876f2bf4841a0aa76d73d83dee1eb5ed965fdd0942c76c"

RPROVIDES:${PN} += "libhivexmod.so \
python-hivex \
python3-hivex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhivex.so.0 \
python-abi"

inherit rpm
