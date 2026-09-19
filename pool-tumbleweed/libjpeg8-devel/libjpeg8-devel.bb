SUMMARY = "Development Tools for applications which will use the Libjpeg Library"
DESCRIPTION = "The libjpeg-devel package includes the header files and libraries \
necessary for compiling and linking programs which will manipulate JPEG \
files using the libjpeg library."
LICENSE = "BSD-3-Clause"

PV = "8.3.2"

RPM_NAME = "libjpeg8-devel-8.3.2-85.1.aarch64.rpm"
RPM_HASH = "a21e609149d986260756c92896640a56d635b217ecfc9ced68ce1163f51d727306755b1827291390417e2422f7ac57f053ea8bebf28ed104f4ccb2100a79bf9e"

RPROVIDES:${PN} += "cmake-libjpeg-turbo \
libjpeg-devel \
libjpeg8-devel \
pkgconfig-libjpeg \
pkgconfig-libturbojpeg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpeg8 \
libturbojpeg0"

inherit rpm
