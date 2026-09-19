SUMMARY = "Allows Python scripts to directly use Subversion repositories"
DESCRIPTION = "Provides Python (SWIG) support for Subversion version control system."
LICENSE = "Apache-2.0"

PV = "1.14.5"

RPM_NAME = "subversion-python-1.14.5-5.3.aarch64.rpm"
RPM_HASH = "2cc28eecfa118fb7afeac08c564675f94e560e357625c7de1c4230b9497b8319450fe4ebd7cb0785db43306ddaa76c1a26378013680e57dc50a0a96c70541607"

RPROVIDES:${PN} += "libsvn-swig-py-1.so.0 \
subversion-python"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libsvn-client-1.so.0 \
libsvn-delta-1.so.0 \
libsvn-diff-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
python-abi \
subversion"

inherit rpm
