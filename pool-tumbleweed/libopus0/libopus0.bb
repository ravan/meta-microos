SUMMARY = "Opus Audio Codec Library"
DESCRIPTION = "The Opus codec is designed for interactive speech and audio transmission over \
the Internet. It is designed by the IETF Codec Working Group and incorporates \
technology from Skype's SILK codec and Xiph.Org's CELT codec."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "libopus0-1.6.1-1.5.aarch64.rpm"
RPM_HASH = "30e60476c4ac04fc89e6cfc0747a780768c7f75f8870428b4dc5b2aa6d0e3d5100427a2dfd2adb3894bf104fa71b74267e49075226dc30f767b4b644b18344c5"

RPROVIDES:${PN} += "libopus.so.0 \
libopus0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
