SUMMARY = "Development data files for hdf5"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains generic files needed to create projects that use \
any version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "hdf5-devel-data-1.14.6-2.7.noarch.rpm"
RPM_HASH = "bef9158cdcecc40ea44999a54b68b1fd5dfd3bf79b493f32be2cb6a4b60de28df6eebf3c0a549d4741a529e4fc5d821ef81eb3f02ad107bb8d1ee589be65ee83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-devel-data \
rpm-macro--hdf5-sonum \
rpm-macro--hdf5-version"

RDEPENDS:${PN} += ""

inherit rpm
