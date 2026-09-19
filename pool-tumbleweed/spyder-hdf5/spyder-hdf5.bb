SUMMARY = "HDF5 I/O plugin for the Spyder IDE"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package contains the plugin that allows Spyder to read and write \
HDF5 files."
LICENSE = "MIT"

PV = "5.5.1"

RPM_NAME = "spyder-hdf5-5.5.1-1.1.noarch.rpm"
RPM_HASH = "7c1eae579c249e52798600e2931794e31062180021b2b2aba838e42078f0415e7184d3282571513e98cfe9c15101672d95077ea243c1fdfea0cb3b4065482f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spyder-hdf5 \
spyder3-hdf5"

RDEPENDS:${PN} += "python-abi \
python3-h5py \
spyder"

inherit rpm
