SUMMARY = "Small, fast speech synthesis engine (text-to-speech)"
DESCRIPTION = "Flite (festival-lite) is a small, fast run-time speech synthesis engine \
developed at CMU and primarily designed for small embedded machines and/or \
large servers. Flite is designed as an alternative synthesis engine to \
Festival for voices built using the FestVox suite of voice building tools."
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "flite-2.2-1.13.aarch64.rpm"
RPM_HASH = "a3d198b785be65eb71e68d79fb8cbd1b47e1a8d9875653b13d8074e5cff8314367c87f1ce7fa2cff922a2996a673b6c656f44af76ad590797b89f33c40fe8399"

RPROVIDES:${PN} += "flite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libflite-cmu-grapheme-lang.so.1 \
libflite-cmu-grapheme-lex.so.1 \
libflite-cmu-indic-lang.so.1 \
libflite-cmu-indic-lex.so.1 \
libflite-cmu-time-awb.so.1 \
libflite-cmu-us-awb.so.1 \
libflite-cmu-us-kal.so.1 \
libflite-cmu-us-kal16.so.1 \
libflite-cmu-us-rms.so.1 \
libflite-cmu-us-slt.so.1 \
libflite-cmulex.so.1 \
libflite-usenglish.so.1 \
libflite.so.1"

inherit rpm
