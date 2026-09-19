SUMMARY = "Performance tools for C++"
DESCRIPTION = "The gperftools-devel package contains static and debug libraries and header \
files for developing applications that use the gperftools package."
LICENSE = "BSD-3-Clause"

PV = "2.18.1"

RPM_NAME = "gperftools-devel-2.18.1-1.4.aarch64.rpm"
RPM_HASH = "1ae47480ab4ed6430c6470e7f4b749c1aabd10209d64fbc612f744cdba72a5e2207fe2afb0a81cdae5556a00e276c1f2497239a1e8bda75337d7c0d287f642fd"

RPROVIDES:${PN} += "google-perftools-devel \
gperftools-devel \
pkgconfig-libprofiler \
pkgconfig-libtcmalloc \
pkgconfig-libtcmalloc-debug \
pkgconfig-libtcmalloc-minimal \
pkgconfig-libtcmalloc-minimal-debug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gperftools \
libprofiler0 \
libstdc++-devel \
libtcmalloc-and-profiler4 \
libtcmalloc-debug4 \
libtcmalloc-minimal-debug4 \
libtcmalloc-minimal4 \
libtcmalloc4 \
pkgconfig-libunwind"

inherit rpm
