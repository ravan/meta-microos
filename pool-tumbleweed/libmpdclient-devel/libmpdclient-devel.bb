SUMMARY = "Development files for libmpdclient"
DESCRIPTION = "This package contains the development files, e.g. header-files, for \
libmpdclient - a stable, documented and asynchronous API library for \
MPD (Music Player Daemon)."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.27"

RPM_NAME = "libmpdclient-devel-2.27-1.1.aarch64.rpm"
RPM_HASH = "5eb3d3dd24d622c700945d9aa63f1a811baa43551027c35a9a434c8c104edc2ddaf7cbce1aea910321a0159b350b89e7bf4f581409c2596f27cc06531f764b89"

RPROVIDES:${PN} += "libmpdclient-devel \
pkgconfig-libmpdclient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpdclient2"

inherit rpm
