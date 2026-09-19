SUMMARY = "Documentation for libsuitesparse_mongoose"
DESCRIPTION = "Documentation for libsuitesparse_mongoose. \
 \
Mongoose is a graph partitioning library. Currently, Mongoose only \
supports edge partitioning. \
 \
mongoose is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-3.0-only"

PV = "7.14.0"

RPM_NAME = "libsuitesparse_mongoose-doc-7.14.0-1.1.noarch.rpm"
RPM_HASH = "9599e88a68cee9acb1089855e4be1f86029c2ff85f34980011b638e5afadbf6c536cd00aeb672eb265d217377d0ad05b03bb4f49d77bb22794303030449f3c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsuitesparse-mongoose-doc"

RDEPENDS:${PN} += ""

inherit rpm
