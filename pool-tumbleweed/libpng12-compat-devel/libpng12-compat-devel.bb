SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng12-compat-devel package contains unversioned symlinks \
to the header files, libraries, configuration files and development \
tools necessary for compiling and linking programs that don't care \
about libpng version."
LICENSE = "Zlib"

PV = "1.2.59"

RPM_NAME = "libpng12-compat-devel-1.2.59-6.2.aarch64.rpm"
RPM_HASH = "7cdbbaa4b1ab654f56078353acc2b84b36d66570b936903c6e3aff37ab574b6850d2a2eb69c0bb4fd7fc4496466b6e531e31e902a691e802eab86a3f435cbb38"

RPROVIDES:${PN} += "libpng-devel \
libpng12-compat-devel \
pkgconfig-libpng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpng12-devel"

inherit rpm
