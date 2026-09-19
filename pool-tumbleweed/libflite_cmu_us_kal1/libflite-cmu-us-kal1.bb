SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite_cmu_us_kal1-2.2-1.13.aarch64.rpm"
RPM_HASH = "6191437af043677f4e8c6d8be0f49667b5c7c870c8856fbe84b7eb3404d312997df0b8d66bbff745c513fd9b1b8a109173f2696d4229d405f8337976b52cea34"

RPROVIDES:${PN} += "libflite-cmu-us-kal.so.1 \
libflite-cmu-us-kal1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libflite-cmulex.so.1 \
libflite-usenglish.so.1 \
libflite.so.1"

inherit rpm
