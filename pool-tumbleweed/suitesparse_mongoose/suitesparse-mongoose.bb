SUMMARY = "Binary executable for suitesparse mongoose"
DESCRIPTION = "Binary executable for suitesparse_mongoose. \
 \
Mongoose is a graph partitioning library. Currently, Mongoose only \
supports edge partitioning. \
 \
mongoose is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-3.0-only"

PV = "7.14.0"

RPM_NAME = "suitesparse_mongoose-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "1956e212c49654afc1956140fd0a628b3c6a79dfe12b34345c114c766a29850ef5dc26f1f7c7ce078474c0e6a2d19b3764de4bc3310a792e371323ea24737b57"

RPROVIDES:${PN} += "suitesparse-mongoose"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsuitesparse-mongoose.so.3 \
libsuitesparseconfig.so.7"

inherit rpm
