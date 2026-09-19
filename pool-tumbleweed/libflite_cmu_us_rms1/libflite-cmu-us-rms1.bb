SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite_cmu_us_rms1-2.2-1.13.aarch64.rpm"
RPM_HASH = "ffd107b2a0f357b7d0b5106afd739331c90a7acede638eaecf015e8a1682668887e7862f9bc2bdf39a812eae504914d9decb9e5dad055b7ee1b00c26975e8453"

RPROVIDES:${PN} += "libflite-cmu-us-rms.so.1 \
libflite-cmu-us-rms1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libflite-cmulex.so.1 \
libflite-usenglish.so.1 \
libflite.so.1"

inherit rpm
