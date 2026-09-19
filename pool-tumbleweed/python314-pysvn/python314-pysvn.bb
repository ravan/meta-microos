SUMMARY = "Highlevel Subversion Python Bindings"
DESCRIPTION = "pysvn is a set of highlevel Python bindings to Subversion. pysvn \
enables tools to be written in Python that use Subversion. \
 \
Features: \
 * Supports all svn client features \
 * Supports svn transaction features required to write svn pre-commit \
   hooks \
 * Python like interface \
 * Documentation and examples provided \
 * No need to understand the Subversion C API"
LICENSE = "Apache-1.1"

PV = "1.9.25"

RPM_NAME = "python314-pysvn-1.9.25-1.3.aarch64.rpm"
RPM_HASH = "b096ba479d7d9afe72ed1d4a7656524ff1b5ff6386ac5ead2d19aff63479e9b28ee4c6f72f33a8d2af55d142c0b80295a3f7302dd96080b85a062edaea49882c"

RPROVIDES:${PN} += "python314-pysvn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libsvn-client-1.so.0 \
libsvn-diff-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
neon \
python-abi \
subversion"

inherit rpm
