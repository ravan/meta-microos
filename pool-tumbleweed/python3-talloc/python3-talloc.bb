SUMMARY = "Python3 bindings for the Talloc library"
DESCRIPTION = "This package contains the Python3 bindings for the Talloc library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.4"

RPM_NAME = "python3-talloc-2.4.4-1.3.aarch64.rpm"
RPM_HASH = "ea758b785e80d670a9e32d9b7cb41becfac6fc80d862d432fd58b566cfb4789000f6eaf9bb798048744da928ec565541c67888670a36332a7cf26b4f93f6e619"

RPROVIDES:${PN} += "libpytalloc-util.cpython-313-aarch64-linux-gnu.so.2 \
python3-talloc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
libtalloc.so.2 \
libtalloc2 \
python-abi"

inherit rpm
