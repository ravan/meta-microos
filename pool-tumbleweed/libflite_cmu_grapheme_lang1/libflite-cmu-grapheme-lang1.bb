SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite_cmu_grapheme_lang1-2.2-1.13.aarch64.rpm"
RPM_HASH = "075ca24313c2cac4fd9a96958e8527f8f8b4db7f93745cfcdec1b1cb61c9651b1dcb38e3e86eeea3e5d69adcf3fb9deeedef893ec591738fa5071f9e1d1a335b"

RPROVIDES:${PN} += "libflite-cmu-grapheme-lang.so.1 \
libflite-cmu-grapheme-lang1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libflite.so.1"

inherit rpm
