SUMMARY = "Headers and objects to build against glbinding"
DESCRIPTION = "glbinding is a C++ binding for the OpenGL API. \
 \
This package provides headers and objects to build against glbinding."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "glbinding-devel-3.5.0-2.5.aarch64.rpm"
RPM_HASH = "e281aaa5aadea210795fed5a3567f5982e25c5003619aecd72c4017b66aa63da78359bdf87a708aabe563c38caaefa9877ec9de8208c184aaf3567fa79f7f5c5"

RPROVIDES:${PN} += "glbinding-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglbinding-aux.so.3 \
libglbinding.so.3 \
libglbinding3 \
libglfw.so.3 \
libstdc++.so.6"

inherit rpm
