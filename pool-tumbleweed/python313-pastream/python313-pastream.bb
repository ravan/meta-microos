SUMMARY = "GIL-less Portaudio Streams for Python"
DESCRIPTION = "Pastream builds on top of portaudio and sounddevice python bindings \
to provide some more functionality. Note that in addition to the \
pastream library, pastream includes a command line application for \
playing and recording audio files."
LICENSE = "MIT"

PV = "0.2.0.post2"

RPM_NAME = "python313-pastream-0.2.0.post2-1.11.aarch64.rpm"
RPM_HASH = "c8f1230722cab8633061e4265fbc47ef9cb0c33c0d2ca4bff9e42fc2a10d7cce80fba934d0770e54434e5508660b526489a8a0873c18257bb986ee0f7d87fb14"

RPROVIDES:${PN} += "python3-pastream \
python3.13dist-pastream \
python313-pastream \
python3dist-pastream"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsndfile \
portaudio \
python-abi \
python313-SoundFile \
python313-cffi \
python313-pa-ringbuffer \
python313-sounddevice \
update-alternatives"

inherit rpm
