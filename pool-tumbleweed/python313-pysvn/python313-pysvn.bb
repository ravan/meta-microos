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

RPM_NAME = "python313-pysvn-1.9.25-1.3.aarch64.rpm"
RPM_HASH = "52b75a489a3e736e0dfddd1412d64241fabee7bc37cbf236c5a46cb807e6d995d9abc5ea75d1446a7eb16f7416c51714ba4850e9a08fe985c417c9f7ba777d3d"

RPROVIDES:${PN} += "python3-pysvn \
python313-pysvn"

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
