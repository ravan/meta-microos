SUMMARY = "C bindings for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "libaudaspace-c1_10-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "eadc4d706fc9ad05a53e3437262244e50e351ca03c3c5cb6cd51789a7e3bec0de3f6dbec12f704cb02951f650e103ce0c40d30d4813ab4c52bd895baaaafed75"

RPROVIDES:${PN} += "libaudaspace-c.so.1.10 \
libaudaspace-c1-10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudaspace.so.1.10 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
