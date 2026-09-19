SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.16.0"

RPM_NAME = "python313-h5py-3.16.0-1.4.aarch64.rpm"
RPM_HASH = "3f8a00103f1d91a1d937afeb890ea35f6b415b8b61df2cb75ef793094823c118d3e279e45cdfe1297bbcd6d12cc5604690b72f2b89df5a3386a1134266b9cdf5"

RPROVIDES:${PN} += "python3-h5py \
python3.13dist-h5py \
python313-h5py \
python3dist-h5py"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-310 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
python-abi \
python313-numpy"

inherit rpm
