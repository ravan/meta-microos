SUMMARY = "GIL-less Portaudio Streams for Python"
DESCRIPTION = "Pastream builds on top of portaudio and sounddevice python bindings \
to provide some more functionality. Note that in addition to the \
pastream library, pastream includes a command line application for \
playing and recording audio files."
LICENSE = "MIT"

PV = "0.2.0.post2"

RPM_NAME = "python314-pastream-0.2.0.post2-1.11.aarch64.rpm"
RPM_HASH = "884ad09973fa281ea9ec1a700671097acb6a882002b6a51982349a297dc33c2a856564953baf8b0facbac44d4279b8f793b31e6ba63f7582af44e3be693cdbd2"

RPROVIDES:${PN} += "python3.14dist-pastream \
python314-pastream \
python3dist-pastream"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsndfile \
portaudio \
python-abi \
python314-SoundFile \
python314-cffi \
python314-pa-ringbuffer \
python314-sounddevice \
update-alternatives"

inherit rpm
