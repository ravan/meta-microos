SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite_cmu_time_awb1-2.2-1.13.aarch64.rpm"
RPM_HASH = "b8507cfa8fb41a18b84ecc2e2cee820a7511776bca557e8bb717f6db8f01f99204172299bd046cdba6332f0047c54bf8398a99457c8cd8caaaabbf5b226c7632"

RPROVIDES:${PN} += "libflite-cmu-time-awb.so.1 \
libflite-cmu-time-awb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libflite-cmulex.so.1 \
libflite-usenglish.so.1 \
libflite.so.1"

inherit rpm
