SUMMARY = "Utilities to read/write HDF5 files, including MATLAB v7.3 MAT files"
DESCRIPTION = "This Python package provides high level utilities to read/write a \
variety of Python types to/from HDF5 (Heirarchal Data Format) formatted \
files. This package also provides support for MATLAB MAT v7.3 formatted \
files, which are just HDF5 files with a different extension and some \
extra meta-data."
LICENSE = "BSD-3-Clause"

PV = "0.1.19"

RPM_NAME = "python314-hdf5storage-0.1.19-3.9.noarch.rpm"
RPM_HASH = "4b38d9208bfd8d02aa95014685b68dca94f4b2fe797fab17a16fe1d96960fbc925220af1bac972276854614cc361f3bd4502f4085249dad823728b07f46a26dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hdf5storage \
python314-hdf5storage \
python3dist-hdf5storage"

RDEPENDS:${PN} += "python-abi \
python314-h5py \
python314-numpy"

inherit rpm
