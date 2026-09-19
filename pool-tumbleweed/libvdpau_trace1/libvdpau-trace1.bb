SUMMARY = "VDPAU trace library"
DESCRIPTION = "This package provides the library for tracing VDPAU function calls. \
Its usage is documented in the README."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "libvdpau_trace1-1.5-5.4.aarch64.rpm"
RPM_HASH = "292bece4c8c96c4227c22e0903b54e580a9955c233f2c8aa277ed201ce38df6fb3ddbce6bd475a2ff162466457a11249ea7ccc7a88bf3c1481c581709b706712"

RPROVIDES:${PN} += "libvdpau-trace \
libvdpau-trace.so.1 \
libvdpau-trace1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvdpau1"

inherit rpm
