SUMMARY = "Software speech synthesizer (text-to-speech)"
DESCRIPTION = "eSpeak is a compact open source software speech synthesizer for English \
and other languages. \
 \
eSpeak uses a 'formant synthesis' method. This allows many languages to \
be provided in a small size. The speech is clear, and can be used at \
high speeds, but is not as natural or smooth as larger synthesizers \
which are based on human speech recordings."
LICENSE = "GPL-3.0-or-later"

PV = "1.48.04"

RPM_NAME = "espeak-1.48.04-8.9.aarch64.rpm"
RPM_HASH = "c9a33e44f2178bd2bfe3c11a96d9ed0c717747479ed56c0c7235837c373e3dde65edf3403deb978d61a3af15901d15cfbf612e936b970ee91bfba25a80d8020b"

RPROVIDES:${PN} += "espeak \
libespeak.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libportaudio.so.2"

inherit rpm
