SUMMARY = "Resampler Application written with libzita-resampler"
DESCRIPTION = "zresample copies an audio file, changing the sample rate and/or the \
sample format. For 16-bit output it can also dither the audio signal. \
 \
zretune resamples an audio file by a the inverse of a ratio expressed \
in cents, without changing the nominal sample rate. The result is to \
change the musical pitch and lenght of the file. \
 \
The input for both tools can be any audio file readable by the \
libsndfile library. The output file type is either WAV, WAVEX, CAF, \
AIFF or FLAC."
LICENSE = "GPL-3.0-or-later"

PV = "1.11.2"

RPM_NAME = "zita-resampler-tools-1.11.2-2.9.aarch64.rpm"
RPM_HASH = "54ea230a007e07cf502e8024b2a507bab067421c07879ae89645ed6aae0097abfac4b85d2d5601266314d0254a957e2544286242337f04f347a9af296e991170"

RPROVIDES:${PN} += "zita-resampler-tools \
zresample \
zretune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6 \
libzita-resampler.so.1"

inherit rpm
