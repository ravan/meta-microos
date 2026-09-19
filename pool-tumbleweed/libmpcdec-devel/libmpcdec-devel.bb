SUMMARY = "Musepack Audio Decoder"
DESCRIPTION = "Musepack is an audio compression format with a strong emphasis on high \
quality. It's not lossless, but it is designed for transparency, so \
that you won't be able to hear differences between the original wave \
file and the much smaller MPC file. \
 \
It is based on the MPEG-1 Layer-2 / MP2 algorithms, but since 1997 it \
has rapidly developed and vastly improved and is now at an advanced \
stage in which it contains heavily optimized and patentless code. \
 \
Musepack is not particularly optimized for low bitrates. The encoder \
was designed to be transparent at the --standard setting, thus little \
low bitrate tuning has gone into the codec, opposite to that of AAC, \
Vorbis, WMA and others which focus more on this region."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "libmpcdec-devel-1.2.6-36.9.aarch64.rpm"
RPM_HASH = "d71a151e438957b88d1dec8eeec4ee14b5796a34661275a6f948bfe7271fa5d5a4f99946ddcff6732582db1013b69dd3e6cc73cdba2fc3bc5249233862406d35"

RPROVIDES:${PN} += "libmpcdec-devel"

RDEPENDS:${PN} += "glibc-devel \
libmpcdec5"

inherit rpm
