SUMMARY = "Development files of ocl-icd"
DESCRIPTION = "This package provides the files needed to build OpenCL client drivers that \
use ocl-icd for ICD functionality."
LICENSE = "BSD-2-Clause"

PV = "2.3.4"

RPM_NAME = "ocl-icd-devel-2.3.4-1.5.aarch64.rpm"
RPM_HASH = "eb32ae0b22d28832d55a81f497a7d0fdfba50990ffd8f30982c839bf73cf7aaa309640cb54486fe47ddaf60ccd79d977b1c3fa292c4835480b9bbb481e626770"

RPROVIDES:${PN} += "ocl-icd-devel \
pkgconfig-OpenCL \
pkgconfig-ocl-icd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libOpenCL1 \
libc.so.6 \
opencl-headers \
pkgconfig-OpenCL-Headers \
pkgconfig-egl"

inherit rpm
