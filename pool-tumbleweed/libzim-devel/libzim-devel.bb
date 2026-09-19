SUMMARY = "Development files for libzim"
DESCRIPTION = "The ZIM library is the reference implementation for the ZIM file format. \
It's a solution to read and write ZIM files on many systems and \
architectures. More information about the ZIM format and the openZIM \
project at https://openzim.org/. \
 \
This package contains development files for libzim."
LICENSE = "GPL-2.0-or-later"

PV = "9.8.2"

RPM_NAME = "libzim-devel-9.8.2-1.1.aarch64.rpm"
RPM_HASH = "9b42ab6f5bb4a41f048d1642b56a7b77fea2959400d4c62970e65ef3b5a0ad7593c3a047a995ef21c3deff05624434a4f040590a621f898847bb60b2d8846969"

RPROVIDES:${PN} += "libzim-devel \
pkgconfig-libzim"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzim9 \
pkgconfig-icu-i18n \
pkgconfig-icu-uc \
pkgconfig-liblzma \
pkgconfig-libzstd \
pkgconfig-xapian-core"

inherit rpm
