SUMMARY = "Python bindings for the libsolv library"
DESCRIPTION = "Python bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.39"

RPM_NAME = "python313-solv-0.7.39-1.4.aarch64.rpm"
RPM_HASH = "853a33ca05dfe2df9e25818529162b715ec951e195430d7f6256cc410815315fb20fedbacf78c03b8f3d0867318c8194ab3dee83da68f0a089e447b0854e6fa6"

RPROVIDES:${PN} += "python3-solv \
python313-solv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.10 \
librpmio.so.10 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1 \
python-abi"

inherit rpm
