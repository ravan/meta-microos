SUMMARY = "An Audio File Library"
DESCRIPTION = "This audio file library is an implementation of the SGI audio file \
library. At present, not all features of the SGI audio file library are \
implemented. \
 \
This library allows the processing of audio data to and from audio \
files of many common formats (currently AIFF, AIFC, WAVE, and \
NeXT/Sun)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.3.6"

RPM_NAME = "audiofile-0.3.6-16.5.aarch64.rpm"
RPM_HASH = "d658262a3183edab2ad2406ee6a72aa6c5e30d21522af3bf471da7b845fc43686de4cc898c794c8f84c52c8da1281f2e2ca2ad7a90a0ab88fe83dc1def1359ff"

RPROVIDES:${PN} += "audiofile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudiofile.so.1 \
libc.so.6"

inherit rpm
