SUMMARY = "Utilities to read/write HDF5 files, including MATLAB v7.3 MAT files"
DESCRIPTION = "This Python package provides high level utilities to read/write a \
variety of Python types to/from HDF5 (Heirarchal Data Format) formatted \
files. This package also provides support for MATLAB MAT v7.3 formatted \
files, which are just HDF5 files with a different extension and some \
extra meta-data."
LICENSE = "BSD-3-Clause"

PV = "0.1.19"

RPM_NAME = "python313-hdf5storage-0.1.19-3.9.noarch.rpm"
RPM_HASH = "576110b96176b9db3e543824d0f0b59e5fe6934a2608c8d0fbccb444447a5acbdf7f8821f1b0ba8ef0af957aa3dfb1c6eb04e0ba8331428f4e7ea320aa4b33f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hdf5storage \
python3.13dist-hdf5storage \
python313-hdf5storage \
python3dist-hdf5storage"

RDEPENDS:${PN} += "python-abi \
python313-h5py \
python313-numpy"

inherit rpm
