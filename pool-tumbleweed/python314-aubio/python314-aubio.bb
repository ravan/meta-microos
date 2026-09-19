SUMMARY = "A collection of tools for music analysis"
DESCRIPTION = "A python module to access the aubio library functions. \
 \
aubio is a library to label music and sounds. It listens to audio signals and attempts to detect events. For instance, when a drum is hit, at which frequency is a note, or at what tempo is a rhythmic melody. \
 \
Its features include segmenting a sound file before each of its attacks, performing pitch detection, tapping the beat and producing midi streams from live audio."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0~alpha~git376"

RPM_NAME = "python314-aubio-0.5.0~alpha~git376-1.1.aarch64.rpm"
RPM_HASH = "7b2d146b2e4925d87cf4cefe607762dc134ea17b53c4f0aae12bf4406e9f6c5e09b056d23bd6a87805536f7d7cc30d043492341c0ebcf7d12bb9d058d4115e2c"

RPROVIDES:${PN} += "python3.14dist-aubio \
python314-aubio \
python3dist-aubio"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-numpy \
update-alternatives"

inherit rpm
