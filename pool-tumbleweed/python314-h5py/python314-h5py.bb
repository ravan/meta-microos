SUMMARY = "Python interface to the Hierarchical Data Format library"
DESCRIPTION = "H5py provides a simple, robust read/write interface to HDF5 data from Python. \
Existing Python and Numpy concepts are used for the interface; for example, \
datasets on disk are represented by a proxy class that supports slicing, and \
has dtype and shape attributes. HDF5 groups are presented using a dictionary \
metaphor, indexed by name."
LICENSE = "BSD-3-Clause"

PV = "3.16.0"

RPM_NAME = "python314-h5py-3.16.0-1.4.aarch64.rpm"
RPM_HASH = "6ad6253b1fa07371686d9e1a349a1a17a0e4c1b1b9555e1dc5151d310442bff0d1d0749bb26599d0b2de65770e178626c74e2d3a477872d32e082ff76c48f9e0"

RPROVIDES:${PN} += "python3.14dist-h5py \
python314-h5py \
python3dist-h5py"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-310 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
python-abi \
python314-numpy"

inherit rpm
