SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite_cmu_indic_lex1-2.2-1.13.aarch64.rpm"
RPM_HASH = "b334d9361c2c5c86cec0501ce9a450198dcbe9ebb71826ea6099635baf0207ada1fa5deecf7150f9d56b76065718344da74f6de39e542d4f0d5278cf2920c517"

RPROVIDES:${PN} += "libflite-cmu-indic-lex.so.1 \
libflite-cmu-indic-lex1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libflite-cmu-indic-lang.so.1 \
libflite-cmulex.so.1 \
libflite.so.1"

inherit rpm
