SUMMARY = "Libraries and header files to develop programs with libadns support"
DESCRIPTION = "Libadns-devel includes the header file and static library to develop \
programs with libads support."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.2"

RPM_NAME = "libadns-devel-1.6.2-1.3.aarch64.rpm"
RPM_HASH = "ffd5c17804fe080762d387b9336c9b532626ae7cafdf48c5ed4570156b53dad8059089fbf2137be2582a0e96202c7fadb022ab4b131b434bfb71f0a293d0204c"

RPROVIDES:${PN} += "libadns-devel"

RDEPENDS:${PN} += "glibc-devel \
libadns1"

inherit rpm
