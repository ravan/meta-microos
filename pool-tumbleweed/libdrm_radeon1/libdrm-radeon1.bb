SUMMARY = "Userspace interface for Kernel DRM services for AMD Radeon chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for AMD Radeon chips."
LICENSE = "MIT"

PV = "2.4.134"

RPM_NAME = "libdrm_radeon1-2.4.134-2.2.aarch64.rpm"
RPM_HASH = "2dfe7bba2382704e6df1fac5b301c735fd4e7893c1246ca8f02a4ac602e12cf8e77f0099804d0230b4b96f348165b968f3f76faa375cee559d7d9c447867522a"

RPROVIDES:${PN} += "libdrm-radeon.so.1 \
libdrm-radeon1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
