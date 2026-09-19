SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.16.0"

RPM_NAME = "python314-h5py-openmpi4-3.16.0-1.3.aarch64.rpm"
RPM_HASH = "a437f3dfd51c1f0233111139d355ba37b974c74a76cfdf4c0bb78d0a610e2e4c49314e14ca48466043bce3b016f4a6fc4a25155355ea36b34da5676bdc8b76c3"

RPROVIDES:${PN} += "python3.14dist-h5py \
python314-h5py-openmpi4 \
python3dist-h5py"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-310-openmpi4 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
libmpi.so.40 \
python314-mpi4py \
python314-numpy"

inherit rpm
