SUMMARY = "A video processing framework"
DESCRIPTION = "VapourSynth's core library with a C++ API."
LICENSE = "LGPL-2.1-only"

PV = "79"

RPM_NAME = "libvapoursynth4-79-1.1.aarch64.rpm"
RPM_HASH = "81658ce771cb2495202d9ab84d1942a51db64ee4ac066e5d938b4dce2ee67cb6b19cad2c097ea60a83e1fd9b2e6d5a40b7ca85daa44e651103fe10d657cc69a2"

RPROVIDES:${PN} += "libvapoursynth.so.4 \
libvapoursynth4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzimg.so.2"

inherit rpm
