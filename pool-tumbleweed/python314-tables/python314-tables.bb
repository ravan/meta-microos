SUMMARY = "Hierarchical datasets for Python"
DESCRIPTION = "PyTables is a package for managing hierarchical datasets and \
designed to efficently cope with extremely large amounts of \
data. PyTables is built on top of the HDF5 library and the \
NumPy package and features an object-oriented interface \
that, combined with C-code generated from Pyrex sources, \
makes of it a fast, yet extremely easy to use tool for \
interactively save and retrieve large amounts of data."
LICENSE = "BSD-3-Clause"

PV = "3.11.1"

RPM_NAME = "python314-tables-3.11.1-1.2.aarch64.rpm"
RPM_HASH = "83cdf92b8610e3842357c3177e058ff5a508f9fccd2f22187eb0ab4903c792e00b66aeb0f121215ab64a7ce264a61c676182e45eb72fa77db4cf08f4324c5680"

RPROVIDES:${PN} += "python3.14dist-tables \
python314-tables \
python3dist-tables"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
hdf5 \
ld-linux-aarch64.so.1 \
libblosc.so.1 \
libblosc2.so.9 \
libbz2.so.1 \
libc.so.6 \
libhdf5.so.310 \
liblzo2.so.2 \
python-abi \
python314-blosc2 \
python314-numexpr \
python314-numpy \
python314-packaging \
python314-py-cpuinfo \
python314-typing-extensions"

inherit rpm
