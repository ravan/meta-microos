SUMMARY = "Examples for hdf5"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides examples of HDF5 library use."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "hdf5-examples-1.14.6-2.7.noarch.rpm"
RPM_HASH = "2ec27d3308e97fddd31836b497928f17bb080bfa7c778bd99acf28ca70336448595dd1443d5485620c761a06c9323f566abcb1ed49016d0cbe47cd7fa8c32c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-examples"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
