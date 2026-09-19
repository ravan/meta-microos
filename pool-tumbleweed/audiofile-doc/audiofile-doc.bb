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

RPM_NAME = "audiofile-doc-0.3.6-16.5.aarch64.rpm"
RPM_HASH = "ee11d481f7a8cca803cf06bfe6907b7a4dc114efc2cb11211aad25dde3467c8b49598b4c47331a4382e944dd92ba22eeb28d46435b712567cc9076757af1fe42"

RPROVIDES:${PN} += "audiofile-doc"

RDEPENDS:${PN} += "audiofile"

inherit rpm
