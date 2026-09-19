SUMMARY = "Header files for nanomsg"
DESCRIPTION = "Development and header files for nanomsg."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "nanomsg-devel-1.2.5-1.1.aarch64.rpm"
RPM_HASH = "b7ea3c1f3226845c4196bdf86a05dfc20a2481efb25c323f5054db6cf1a388d0ea53ccd7f1e79acab287218f13f022f3d09584e10c8c16af0232fbc66db7ab93"

RPROVIDES:${PN} += "cmake-nanomsg \
nanomsg-devel \
pkgconfig-nanomsg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnanomsg.so.6 \
libnanomsg6"

inherit rpm
