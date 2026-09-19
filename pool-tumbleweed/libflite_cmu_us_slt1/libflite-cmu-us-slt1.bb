SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite_cmu_us_slt1-2.2-1.13.aarch64.rpm"
RPM_HASH = "cd423ff8f876ae247de1311977bff38d160c9a2f39d2b07a9e85f37c752beebdf6135f8dd426834de97015a85c01c412abf1afa8c133740bc5faa41bfee04568"

RPROVIDES:${PN} += "libflite-cmu-us-slt.so.1 \
libflite-cmu-us-slt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libflite-cmulex.so.1 \
libflite-usenglish.so.1 \
libflite.so.1"

inherit rpm
