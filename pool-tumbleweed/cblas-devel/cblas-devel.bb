SUMMARY = "Native C interface to BLAS: headers and sources for development"
DESCRIPTION = "This library provides a native C interface to BLAS routines available \
at www.netlib.org/blas to facilitate usage of BLAS functionality \
for C programmers. \
 \
This package provides the cblas headers and development files."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "cblas-devel-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "0558a9779332b33d5629fecfcb198f26ea3ec2fa4b98399355353cdd5d19d9e0bdd7af4137ca0fdb8825f003170932961e033ae5308a8310648861522147d14f"

RPROVIDES:${PN} += "cblas \
cblas-devel \
cmake-cblas \
pkgconfig-cblas"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcblas3 \
pkgconfig-blas"

inherit rpm
