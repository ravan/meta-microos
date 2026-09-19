SUMMARY = "Native C Interface to LAPACK: static library"
DESCRIPTION = "LAPACKE provides a native C interface to LAPACK routines available \
at www.netlib.org/lapack to facilitate usage of LAPACK functionality \
for C programmers. \
 \
This package provides the static library for LAPACKE."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "lapacke-devel-static-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "2eebeb807953a34b3b85faedda8482671b94bb22146ed00d9d3acfbf85c776a4dadbbb17cd156d977e1fb5bd54db204b5750443c5228c75e69c9d3576a791b51"

RPROVIDES:${PN} += "lapacke-devel-static"

RDEPENDS:${PN} += "lapacke-devel"

inherit rpm
