SUMMARY = "A Clone of the Atari 2600 Game 'Circus Atari'"
DESCRIPTION = "The object is to move a teeter-totter back and forth across the screen \
to bounce clowns into the air. When they reach the top, they pop rows \
of balloons, and then fall back down."
LICENSE = "GPL-1.0"

PV = "1.0.3"

RPM_NAME = "circuslinux-1.0.3-1286.9.aarch64.rpm"
RPM_HASH = "1a4346d0f78f025bb32e2711a39f7941f230d57b41391215be609cda2936235626dc7e3833faeac7103fd363dad4760b14670a5e8401c189cb0ce41a96f71238"

RPROVIDES:${PN} += "circuslinux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6"

inherit rpm
