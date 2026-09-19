SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-3.0.5-2.2.aarch64.rpm"
RPM_HASH = "f699b937717fcfc39fef8db8c817b493ee4e3a051755dda9f215b12c8f0ff80d453ee5c82f2d9f0094158c8cbb8747b6434f38fd261decc1ec175a8112fd1ebd"

RPROVIDES:${PN} += "lib.cpython-314-aarch64-linux-gnu.so \
python3.14dist-pandas \
python314-pandas \
python314-pandas-doc \
python3dist-pandas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy \
python314-python-dateutil \
timezone"

inherit rpm
