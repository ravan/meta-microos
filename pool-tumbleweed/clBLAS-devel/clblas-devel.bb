SUMMARY = "Headers and devel files for clBLAS - a BLAS library for OpenCL"
DESCRIPTION = "clBLAS is a software library containing BLAS functions written in OpenCL. The \
complete set of BLAS level 1, 2 and 3 routines is implemented. In addition to \
GPU devices, the library also supports running on CPU devices to facilitate \
debugging and multicore programming. \
 \
This package provides the headers and sources needed for developing software \
against clBLAS."
LICENSE = "Apache-2.0"

PV = "2.12+git.20170323.cf91139"

RPM_NAME = "clBLAS-devel-2.12+git.20170323.cf91139-3.6.aarch64.rpm"
RPM_HASH = "62a960d605391a0db71d0bc014f4ab53e219969a998a43b8e1b1f8548a253fdd5ad66810dc7493ffc177ff5c2b46f4fc173e80427b3ff602fb28b3ad86587bc9"

RPROVIDES:${PN} += "clBLAS-devel \
cmake-clBLAS \
pkgconfig-clBLAS"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libclBLAS2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
