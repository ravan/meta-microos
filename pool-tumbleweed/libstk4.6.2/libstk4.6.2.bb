SUMMARY = "Synthesis ToolKit in C++"
DESCRIPTION = "The Synthesis ToolKit in C++ (STK) is a set of audio signal \
processing and algorithmic synthesis classes. STK facilitates \
development of music synthesis and audio processing software, \
focusing on realtime control and example code. STK is \
user-extensible."
LICENSE = "MIT"

PV = "4.6.2"

RPM_NAME = "libstk4.6.2-4.6.2-1.14.aarch64.rpm"
RPM_HASH = "6f01077f8b753204372014bc7f1faaf3836527d8c92284c3616644ab02d0abb1eae0d825ba9272070a6fc6e0b27c7f4710b790ff38df8022e91bd48b76587057"

RPROVIDES:${PN} += "libstk4.6.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libstdc++.so.6 \
stk-data"

inherit rpm
