SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite_cmu_grapheme_lex1-2.2-1.13.aarch64.rpm"
RPM_HASH = "ddde2aa68090a987d1b6dd0e7fe171959745fa1ca91ab0f934e3e4e3b1816fe45a6f6f500248e5a700919254666663e65ea5d618501cc05b770e63139ec8030d"

RPROVIDES:${PN} += "libflite-cmu-grapheme-lex.so.1 \
libflite-cmu-grapheme-lex1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflite.so.1"

inherit rpm
