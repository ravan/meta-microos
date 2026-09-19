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

RPM_NAME = "python314-sparse-0.19.2-1.1.noarch.rpm"
RPM_HASH = "92fea67a6031be59c560277fbf82ff93dc4d71bb51a50a33c8a1a6f15efb15638a0af62685a7495b0ee621d56fa53c9324cc78b27fef661f7d21e7f06dd971b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sparse \
python314-sparse \
python3dist-sparse"

RDEPENDS:${PN} += "python-abi \
python314-numba \
python314-numpy \
python314-scipy"

inherit rpm
