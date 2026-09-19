SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.16.0"

RPM_NAME = "python313-h5py-openmpi4-3.16.0-1.3.aarch64.rpm"
RPM_HASH = "9f5e8c622e3ad6e0a4e8aeed7920d8ef8b6c21c14a1c1f984de6fe2ac3cab316c04c31ead0dd4b9b97582e86d045f5dfe496d358d9e871ea7f115c20d18a9d2f"

RPROVIDES:${PN} += "python3-h5py-openmpi4 \
python3.13dist-h5py \
python313-h5py-openmpi4 \
python3dist-h5py"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-310-openmpi4 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
libmpi.so.40 \
python313-mpi4py \
python313-numpy"

inherit rpm
