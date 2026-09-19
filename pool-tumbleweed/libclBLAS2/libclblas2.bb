SUMMARY = "Shared library for clBLAS - a BLAS library for OpenCL"
DESCRIPTION = "clBLAS is a software library containing BLAS functions written in OpenCL. The \
complete set of BLAS level 1, 2 and 3 routines is implemented. In addition to \
GPU devices, the library also supports running on CPU devices to facilitate \
debugging and multicore programming. \
 \
This package provides the shared libs for clBLAS."
LICENSE = "Apache-2.0"

PV = "2.12+git.20170323.cf91139"

RPM_NAME = "libclBLAS2-2.12+git.20170323.cf91139-3.6.aarch64.rpm"
RPM_HASH = "45c8f14b1150648429024a739c1cfb50a2b3ea3bdbda8ab4b5385383bf5c02efa285a51818c1dcc9d15a618be11b2ceb62025f7616148ad78affa27f9cc6107e"

RPROVIDES:${PN} += "libclBLAS.so.2 \
libclBLAS2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
