SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng16-compat-devel package contains unversioned symlinks \
to the header files, libraries, configuration files and development \
tools necessary for compiling and linking programs that don't care \
about libpng version."
LICENSE = "libpng-2.0"

PV = "1.6.58"

RPM_NAME = "libpng16-compat-devel-1.6.58-2.1.aarch64.rpm"
RPM_HASH = "2d883d13fe8186a0712b8296ce8b049101fcbecbc6c282a19a1251a9eb258ed82d21e0db61d1672facfb36e35adcc6e1cb0821df5afcd681dd67fc4b0b433cbe"

RPROVIDES:${PN} += "libpng-devel \
libpng16-compat-devel \
pkgconfig-libpng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpng16-devel \
pkgconfig-zlib"

inherit rpm
