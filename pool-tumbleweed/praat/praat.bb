SUMMARY = "Phonetics by computer"
DESCRIPTION = "Praat is an open-software tool for the analysis of speech in phonetics. \
Through its graphical interface, several speech analysis functionalities \
are available: spectrograms, cochleograms, and pitch and formant extraction. \
Articulatory synthesis, as well as synthesis from pitch, formant, and \
intensity are also available. Other features are segmentation, labelling \
using the phonetic alphabet, and computation of statistics. \
Praat is configurable and extensible through its own scripting language and has \
provisions for communicating with other programs."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.02"

RPM_NAME = "praat-7.0.02-1.1.aarch64.rpm"
RPM_HASH = "dbad01b9291c3171d5a71c0ce5e1e1f063b0510d3248d72b11fa12a462fafb2550d002ae30da2a2b25795d19b136bbeea3f3fa7c9aae28414d51d85609f13b41"

RPROVIDES:${PN} += "praat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libglpk.so.40 \
libgobject-2.0.so.0 \
libgsl.so.28 \
libgslcblas.so.0 \
libgtk-3.so.0 \
libjack.so.0 \
libm.so.6 \
libmp3lame.so.0 \
libogg.so.0 \
libopusfile.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
