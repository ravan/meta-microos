SUMMARY = "A collection of tools for music analysis"
DESCRIPTION = "A python module to access the aubio library functions. \
 \
aubio is a library to label music and sounds. It listens to audio signals and attempts to detect events. For instance, when a drum is hit, at which frequency is a note, or at what tempo is a rhythmic melody. \
 \
Its features include segmenting a sound file before each of its attacks, performing pitch detection, tapping the beat and producing midi streams from live audio."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0~alpha~git376"

RPM_NAME = "python313-aubio-0.5.0~alpha~git376-1.1.aarch64.rpm"
RPM_HASH = "894ec069b19dd355cdff96c91d431eb9524e213b90d9511070d840302ddddb5c849e8ad5d1c2982715220b846dac04440e035e7090ac75c9a3e34fdda59a2823"

RPROVIDES:${PN} += "python3-aubio \
python3.13dist-aubio \
python313-aubio \
python3dist-aubio"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-numpy \
update-alternatives"

inherit rpm
