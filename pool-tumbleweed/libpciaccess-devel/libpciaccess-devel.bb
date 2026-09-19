SUMMARY = "Development files for the Generic PCI access library"
DESCRIPTION = "Provides functionality for X to access the PCI bus and devices in a \
platform-independent way. \
 \
This package contains the development headers for the library found \
in libpciaccess0."
LICENSE = "MIT"

PV = "0.19"

RPM_NAME = "libpciaccess-devel-0.19-1.3.aarch64.rpm"
RPM_HASH = "dc240ee904f925f22fa97b310055613ed9bef0794083720a6fd64c7159e8248ee4f232253ab2068fbad6e643116274817c1039dd36ec2cdef13d7a3269bd7fb0"

RPROVIDES:${PN} += "libpciaccess-devel \
libpciaccess0-devel \
pkgconfig-pciaccess"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpciaccess0 \
pkgconfig-zlib"

inherit rpm
