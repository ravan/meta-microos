SUMMARY = "Man pages for BLAS, CBLAS, and LAPACK"
DESCRIPTION = "This package provides the man pages for BLAS, CBLAS, and LAPACK."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "lapack-man-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "54f2791381a798d64a5f896f643639f5476af989e479b89f4e7880b3213736afe547c88c94f4f8e2230487ac46f3a9c577ae5264d5622e335aeb0155fb79fd31"

RPROVIDES:${PN} += "lapack-man"

RDEPENDS:${PN} += ""

inherit rpm
