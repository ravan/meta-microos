SUMMARY = "An extended version of CSparse"
DESCRIPTION = "CXSparse is an extended version of CSparse, with support for double \
or complex matrices, with int or long integers. \
 \
CXSparse is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "7.14.0"

RPM_NAME = "libcxsparse4-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "7e88a7c9b8c79aa1432d7deb9df75b39628f0cf84152ccaf22c6f3fa3c86ec87142f98847c23d4f863f01df8e4182c9968d11a3961bd23137b9ae0a4a5f776b0"

RPROVIDES:${PN} += "libcxsparse.so.4 \
libcxsparse4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6 \
libsuitesparseconfig.so.7"

inherit rpm
