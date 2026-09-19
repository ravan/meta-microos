SUMMARY = "MiniSEED data format library"
DESCRIPTION = "The miniSEED library provides a framework for manipulation of miniSEED records, \
a format commonly used for seismological time series and related data. The \
library includes the functionality to read and write data records, in addition \
to reconstructing time series from multiple records. \
 \
This package contains the shared library."
LICENSE = "Apache-2.0"

PV = "3.5.4"

RPM_NAME = "libmseed3-3.5.4-1.1.aarch64.rpm"
RPM_HASH = "6292601f149742c47e44d138041787e58549b50fad1c18e8fe5f09f9afff3bb359af3f7dbc90df788df33509d661abdd19d700a9e43d1fe47aa7e768aba59c3b"

RPROVIDES:${PN} += "libmseed.so.3 \
libmseed3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
