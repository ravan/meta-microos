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

RPM_NAME = "python313-tables-3.11.1-1.2.aarch64.rpm"
RPM_HASH = "771bae9b99353a85a033601859deb8c47c23405cac14706025906f37d881a3902b0f29ee116996f91b56a836acf02411df1660a39a24758eef5eecf5261757bf"

RPROVIDES:${PN} += "python3-tables \
python3.13dist-tables \
python313-tables \
python3dist-tables"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
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
python313-blosc2 \
python313-numexpr \
python313-numpy \
python313-packaging \
python313-py-cpuinfo \
python313-typing-extensions"

inherit rpm
