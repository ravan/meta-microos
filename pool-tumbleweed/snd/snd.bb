SUMMARY = "Sound File Editor"
DESCRIPTION = "Snd is a sound editor modelled loosely after Emacs and an old, \
PDP-10 sound editor named Dpysnd. It can accommodate any \
number of sounds each with any number of channels and can be customized \
and extended using guile and guile-gtk."
LICENSE = "LGPL-2.1-or-later"

PV = "26.4"

RPM_NAME = "snd-26.4-1.3.aarch64.rpm"
RPM_HASH = "f0c6aa9a2b828d44d13b3c28aafcafed0f1f2644b938f923639e9472f4d72dfb41a55e652a1211ab14f85aedbb1bcf634d1de0731431f49d7e6369d7cd1e8acf"

RPROVIDES:${PN} += "snd"

RDEPENDS:${PN} += "ladspa \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXext.so.6 \
libXm.so.4 \
libXpm.so.4 \
libXt.so.6 \
libasound.so.2 \
libc.so.6 \
libfftw3.so.3 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6"

inherit rpm
