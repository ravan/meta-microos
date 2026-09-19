SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite_cmu_us_awb1-2.2-1.13.aarch64.rpm"
RPM_HASH = "0beb0b1a5a3ef48c1d2db337c0796284ea4404e141be9891905d4a0c8bcdba5c01e9e028acb25d9ef34f1bff64606a805e2505ff099bf732e3361968e108e731"

RPROVIDES:${PN} += "libflite-cmu-us-awb.so.1 \
libflite-cmu-us-awb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libflite-cmulex.so.1 \
libflite-usenglish.so.1 \
libflite.so.1"

inherit rpm
