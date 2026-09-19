SUMMARY = "An Audio Output Library"
DESCRIPTION = "Libao is an audio output library, supporting a number of \
outputs, such as ALSA, PulseAudio, and PCM files."
LICENSE = "GPL-2.0+"

PV = "1.2.2+git20180114.d522165"

RPM_NAME = "libao4-1.2.2+git20180114.d522165-3.9.aarch64.rpm"
RPM_HASH = "072a75e6bc5ab9008de55a9f14f16657be989364f4158d808f7a3808fb40bbef1cc2a800200bacec10cc82a146f7f61e1e2c9debf8c4ed952c6f5d00deeb09b0"

RPROVIDES:${PN} += "libao \
libao.so.4 \
libao4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libao-plugins4 \
libc.so.6"

inherit rpm
