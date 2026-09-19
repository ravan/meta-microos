SUMMARY = "Python data structures for data analysis, time series, and statistics"
DESCRIPTION = "Pandas is a Python package providing data structures designed for \
working with structured (tabular, multidimensional, potentially \
heterogeneous) and time series data. It is a high-level building \
block for doing data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-3.0.5-2.2.aarch64.rpm"
RPM_HASH = "b3eb3243c082c22e61ad0aa86f01ab703b56b10c9e78f14c610ac19a76d026b8c6c7411b5002bee0071fb331d7e9c667c51980877175c2e4d93dcd55e48adfde"

RPROVIDES:${PN} += "lib.cpython-313-aarch64-linux-gnu.so \
python3-pandas \
python3-pandas-doc \
python3.13dist-pandas \
python313-pandas \
python313-pandas-doc \
python3dist-pandas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy \
python313-python-dateutil \
timezone"

inherit rpm
