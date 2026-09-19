SUMMARY = "Auxiliary shared library for glbinding"
DESCRIPTION = "glbinding is a C++ binding for the OpenGL API. \
 \
This package provides the shared library for additional, auxiliary features as \
logging, meta information, or debugging functionality"
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "libglbinding-aux3-3.5.0-2.5.aarch64.rpm"
RPM_HASH = "34709031b983e7d2f067d7062e8e55f7641be3aeeb113a541a5b1cca10023fe6a197169f2c0ea15cf1e541386e479710ce7426cefe48724f87258a33d141a4ab"

RPROVIDES:${PN} += "libglbinding-aux.so.3 \
libglbinding-aux3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglbinding.so.3 \
libstdc++.so.6"

inherit rpm
