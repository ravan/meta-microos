SUMMARY = "VDPAU wrapper library"
DESCRIPTION = "This package contains the libvdpau wrapper library and the libvdpau_trace \
debugging library, along with the header files needed to build VDPAU \
applications.  To actually use a VDPAU device, you need a vendor-specific \
implementation library.  Currently, this is always libvdpau_nvidia.  You can \
override the driver name by setting the VDPAU_DRIVER environment variable."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "libvdpau1-1.5-5.4.aarch64.rpm"
RPM_HASH = "36e81de0442ff140f5e7a8b6b5359364f3e17df5d0c4e6b7cb4097d928a1a2e1eb4e9d0e70cee6ec9d502e6f6eb718054e906f5429586fc4a23924be4320a6b7"

RPROVIDES:${PN} += "libvdpau \
libvdpau.so.1 \
libvdpau1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
