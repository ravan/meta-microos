SUMMARY = "MATLAB Toolbox for Reading/Writing Sparse Matrices"
DESCRIPTION = "RBio is a MATLAB toolbox for reading/writing sparse matrices in the \
Rutherford/Boeing format, and for reading/writing problems in the UF \
Sparse Matrix Collection from/to a set of files in a directory. \
Version 2.0+ is written in C. \
 \
RBio is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later"

PV = "7.14.0"

RPM_NAME = "librbio4-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "000f5721f4825540efa380178bde27406faa66f8ab9195937c52a4e43c50e79d43beb260158c496378299b8f895391168479bf8e050a0ed2ce6cca6e0ac5ea8f"

RPROVIDES:${PN} += "librbio.so.4 \
librbio4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libsuitesparseconfig.so.7"

inherit rpm
