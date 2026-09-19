SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite_cmu_us_kal16-1-2.2-1.13.aarch64.rpm"
RPM_HASH = "c35f9239ee7eccb7155bf6015296b1c4167adb7286930042ec7c5f82ef9daf51ad8371646202b05fff996e08105152af612cb8212b62d85a08dd78bd8bdcec09"

RPROVIDES:${PN} += "libflite-cmu-us-kal16-1 \
libflite-cmu-us-kal16.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libflite-cmulex.so.1 \
libflite-usenglish.so.1 \
libflite.so.1"

inherit rpm
