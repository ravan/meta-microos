SUMMARY = "Library for real-time audio labelling"
DESCRIPTION = "Aubio is a library for real time audio labelling. Its features include \
segmenting a sound file before each of its attacks, performing pitch \
detection, tapping the beat and producing midi streams from live audio. \
The name aubio comes from 'audio' with a typo: several transcription \
errors are likely to be found in the results too."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9+git376"

RPM_NAME = "libaubio5-0.4.9+git376-1.1.aarch64.rpm"
RPM_HASH = "6c55694912ad8a3f3e37de9872eddbf6cc6a498377d5772815ea58b13e4636ba839d879d6265590e484df0fbdbcb9126f2d1ac66f29570c7260ab72232cd9343"

RPROVIDES:${PN} += "libaubio.so.5 \
libaubio5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libFLAC.so.14 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libfftw3f.so.3 \
libm.so.6 \
libogg.so.0 \
libsamplerate.so.0 \
libsndfile.so.1 \
libswresample.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
