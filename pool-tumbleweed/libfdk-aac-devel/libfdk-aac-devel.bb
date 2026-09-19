SUMMARY = "Development files for fdk-aac-free"
DESCRIPTION = "The libfdk-aac-devel package contains libraries and header files for \
developing applications that use fdk-aac-free."
LICENSE = "FDK-AAC"

PV = "2.0.3"

RPM_NAME = "libfdk-aac-devel-2.0.3-1.2.aarch64.rpm"
RPM_HASH = "1419438407a2a3ba175896425a71d127f1e08c00a3db65c5d40e006e470fb88ac4f7d1f7643d423dffa5a38c58f0de108a718e528447713d0285a4d30800f12d"

RPROVIDES:${PN} += "fdk-aac-free-devel \
libfdk-aac-devel \
pkgconfig-fdk-aac"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdk-aac2"

inherit rpm
