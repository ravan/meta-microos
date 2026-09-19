SUMMARY = "How many tomatoes can you smash in ten short minutes?"
DESCRIPTION = "I Have No Tomatoes is an extreme leisure time activity idea of which \
culminates in the following question: How many tomatoes can you smash \
in ten short minutes? If you have the time to spare, this game has the \
vegetables just waiting to beeliminated!"
LICENSE = "Zlib"

PV = "1.55"

RPM_NAME = "tomatoes-1.55-4.4.aarch64.rpm"
RPM_HASH = "6d5af7273707be927f63d7bb5d78adc1ba0c5c6be437bed149718ab8effa81b6874a0efe20ed50b54347ee0de82b2c822a5d0d392f6aaa47691fa4920511d924"

RPROVIDES:${PN} += "config-tomatoes \
tomatoes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
