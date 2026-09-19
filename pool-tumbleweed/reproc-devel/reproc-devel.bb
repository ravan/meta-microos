SUMMARY = "Development files for reproc"
DESCRIPTION = "reproc (Redirected Process) is a cross-platform C/C++ library that simplifies starting, stopping and communicating with external programs. The main use case is executing command line applications directly from C or C++ code and retrieving their output. \
 \
This package holds the development files for reproc."
LICENSE = "MIT"

PV = "14.2.7"

RPM_NAME = "reproc-devel-14.2.7-1.3.aarch64.rpm"
RPM_HASH = "770cef50035ebbee493e0f2a6417b069275097228a259dbb57beac51328f9cee3496488025e39e35d5a73e4920a6c25047763951d781a5f762eabb6de2f71815"

RPROVIDES:${PN} += "cmake-reproc \
cmake-reproc++ \
pkgconfig-reproc \
pkgconfig-reproc++ \
reproc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libreproc++14 \
libreproc14"

inherit rpm
