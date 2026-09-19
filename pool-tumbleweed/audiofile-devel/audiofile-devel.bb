SUMMARY = "An audio file library"
DESCRIPTION = "This Audio File Library is an implementation of the SGI Audio File \
library. At present, not all features of the SGI Audio File library are \
implemented. \
 \
This library allows the processing of audio data to and from audio \
files of many common formats (currently AIFF, AIFC, WAVE, and \
NeXT/Sun)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.3.6"

RPM_NAME = "audiofile-devel-0.3.6-16.5.aarch64.rpm"
RPM_HASH = "5fdbc1f9459a8e2cab77fded7873c30ef1eb0ea8eba88b2486826429f709d6aa9594765612fb570c13aa7e09f84adedb1494ef51cf8b1547d1043ab693579ca1"

RPROVIDES:${PN} += "audiofile-devel \
pkgconfig-audiofile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaudiofile1"

inherit rpm
