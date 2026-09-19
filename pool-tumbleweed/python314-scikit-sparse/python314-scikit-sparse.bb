SUMMARY = "Scikits sparse matrix package"
DESCRIPTION = "Sparse matrix tools. \
 \
This is a sparse matrix code in Python that plays well with \
scipy.sparse, but that is somehow unsuitable for inclusion in scipy \
proper. \
 \
There is a wrapper for the CHOLMOD library for sparse Cholesky \
decomposition."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.16"

RPM_NAME = "python314-scikit-sparse-0.4.16-1.6.aarch64.rpm"
RPM_HASH = "833fbfe788d526a5412114bd3b2f0b315a7a3872978fe4120b3f68b17764f9ea3cb696920325f421e4f846b6d0bc0e666d6c1b168f266580a74beb850ca30520"

RPROVIDES:${PN} += "python3.14dist-scikit-sparse \
python314-scikit-sparse \
python3dist-scikit-sparse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcholmod.so.5 \
python-abi \
python314-numpy \
python314-scipy"

inherit rpm
