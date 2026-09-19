SUMMARY = "A high-level audio library"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "libaudaspace1_10-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "1a6080d165f918686ef9f4e51bd1de2a514464d1a39697c51183bb609e6e5b80fbda18578b3bf018fec70dcbeab1d965111a33a8a4eacac95ebbc234ccbaf6de"

RPROVIDES:${PN} += "libaudaspace.so.1.10 \
libaudaspace1-10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
librubberband.so.3 \
libstdc++.so.6"

inherit rpm
