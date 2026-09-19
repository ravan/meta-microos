SUMMARY = "Graph partitioning library"
DESCRIPTION = "Mongoose is a graph partitioning library. Currently, Mongoose only \
supports edge partitioning. \
 \
mongoose is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-3.0-only"

PV = "7.14.0"

RPM_NAME = "libsuitesparse_mongoose3-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "3e355804c3b08a9e45db5c52ea73ef3f83b303dd201f6560ebd3a2a3cdf2950469a737ba7743efac6c260f6c083ceceaffd2c644326ae8703797f6dc79abdf7b"

RPROVIDES:${PN} += "libsuitesparse-mongoose.so.3 \
libsuitesparse-mongoose3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsuitesparseconfig.so.7"

inherit rpm
