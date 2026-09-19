SUMMARY = "Shared library for reproc"
DESCRIPTION = "reproc (Redirected Process) is a cross-platform C/C++ library that simplifies starting, stopping and communicating with external programs. The main use case is executing command line applications directly from C or C++ code and retrieving their output. \
 \
This package holds the shared library for reproc."
LICENSE = "MIT"

PV = "14.2.7"

RPM_NAME = "libreproc++14-14.2.7-1.3.aarch64.rpm"
RPM_HASH = "976de23549b24eac750628c141a58043c1fea2d719efd04f11576575747fd966e02502f062e2f6af0017eea30749677905ad86af4a1eec1a6b584b8035b85721"

RPROVIDES:${PN} += "libreproc++.so.14 \
libreproc++14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libreproc.so.14 \
libstdc++.so.6"

inherit rpm
