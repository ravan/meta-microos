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

RPM_NAME = "python313-scikit-sparse-0.4.16-1.6.aarch64.rpm"
RPM_HASH = "94c1ea3aabf156cd72ef1261edb3c3277eff90779fa28119df307f5ffdc482ce8b807ce754ce91140122826cdb3187fae3ee2d2610e1fe0d85782c31b79e4a4e"

RPROVIDES:${PN} += "python3-scikit-sparse \
python3.13dist-scikit-sparse \
python313-scikit-sparse \
python3dist-scikit-sparse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcholmod.so.5 \
python-abi \
python313-numpy \
python313-scipy"

inherit rpm
