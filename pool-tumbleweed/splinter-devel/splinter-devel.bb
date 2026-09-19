SUMMARY = "Development files for splinter, a multivariate function approximation library"
DESCRIPTION = "SPLINTER (SPLine INTERpolation) is a library for multivariate function \
approximation implemented in C++. The library can be used for function \
approximation, regression and data smoothing. \
 \
This package provides the header files and sources required for \
developing applications with splinter."
LICENSE = "MPL-2.0"

PV = "3.0"

RPM_NAME = "splinter-devel-3.0-4.5.aarch64.rpm"
RPM_HASH = "f2fbd1ddf2d5b912ae1732d48d33e6d9bcd46ffdc61ec8d5f1259e0514c433ef17fe69ef8d27cd739c5d1b5b1c981916f7154989a05e43d63ed65b69069c96ca"

RPROVIDES:${PN} += "splinter-devel"

RDEPENDS:${PN} += "libsplinter-3-0"

inherit rpm
