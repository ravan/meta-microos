SUMMARY = "Python Bindings for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "libaudaspace-py1_10-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "831d07c4f188924443a4a347357a9dfe7e25a356e21b3523ad4a9bd0be5fe8bc4a3ce221ab32577d1cbf8d410fb268be8e9617ad0bb176982f50d021612a8125"

RPROVIDES:${PN} += "libaudaspace-py.so.1.10 \
libaudaspace-py1-10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudaspace.so.1.10 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6"

inherit rpm
