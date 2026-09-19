SUMMARY = "Sparse n-dimensional arrays for Python"
DESCRIPTION = "This module implements sparse multidimensional arrays on top of NumPy and \
Scipy.sparse. It generalizes the scipy.sparse.coo_matrix layout, but \
extends beyond just rows and columns to an arbitrary number of \
dimensions. \
 \
The original motivation is for machine learning algorithms, but it is \
intended for somewhat general use."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "python313-sparse-0.19.2-1.1.noarch.rpm"
RPM_HASH = "ba386467c4ac0671f3f20332d341cd4e5477aa4af5a088e8a03ddce3f3dc0cbda111900ca0b32a61c9a79edab391b2ca5646d7e3211b1465fc5fa16f2b7e966f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sparse \
python3.13dist-sparse \
python313-sparse \
python3dist-sparse"

RDEPENDS:${PN} += "python-abi \
python313-numba \
python313-numpy \
python313-scipy"

inherit rpm
