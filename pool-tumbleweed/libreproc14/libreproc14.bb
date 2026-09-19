SUMMARY = "Shared library for reproc"
DESCRIPTION = "reproc (Redirected Process) is a cross-platform C/C++ library that simplifies starting, stopping and communicating with external programs. The main use case is executing command line applications directly from C or C++ code and retrieving their output. \
 \
This package holds the shared library for reproc."
LICENSE = "MIT"

PV = "14.2.7"

RPM_NAME = "libreproc14-14.2.7-1.3.aarch64.rpm"
RPM_HASH = "9a7d243dce8040866ba1073530f3dcd46f918b61a24dfb8707e0a02a204c9b327735ebe13630b47d2bcfb5e9f3bc8825785a33c2f489b8e4eb740075d991380d"

RPROVIDES:${PN} += "libreproc.so.14 \
libreproc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
