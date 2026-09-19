SUMMARY = "Files needed for building packages which use Xapian"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval library. It offers an \
adaptable toolkit for adding indexing and search facilities to \
applications. \
 \
This subpackage contains the header files for the library."
LICENSE = "GPL-2.0-only"

PV = "1.4.27"

RPM_NAME = "libxapian-devel-1.4.27-1.6.aarch64.rpm"
RPM_HASH = "0248d6a5013818294d3f7c25aa3c28827ad5c646767aa6de595afd334d6a46677936726a40518289621a48a6567c51eea7582de5a4241c9a3d1bd31193410c47"

RPROVIDES:${PN} += "libxapian-devel \
pkgconfig-xapian-core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gcc-c++ \
libuuid-devel \
libxapian30 \
zlib-devel"

inherit rpm
