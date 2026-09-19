SUMMARY = "Development files of soxr"
DESCRIPTION = "The soxr development package includes the header files, \
libraries, development tools necessary for compiling and linking \
application which will use libsoxr/libsoxr-lsr."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.3"

RPM_NAME = "soxr-devel-0.1.3-3.5.aarch64.rpm"
RPM_HASH = "b9ad2ad4d3fe2f1028ec632c83755a73fdb96a36d88eeeff152ba1b341cef99037d26fb0ac83b65bfe4477b066762d5e068812a3783b3476fea70ca31ecb6ed9"

RPROVIDES:${PN} += "pkgconfig-soxr \
pkgconfig-soxr-lsr \
soxr-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsoxr-lsr0 \
libsoxr0"

inherit rpm
