SUMMARY = "TrustedQSL ham-radio applications"
DESCRIPTION = "The TrustedQSL applications are used for generating digitally signed \
QSO records (records of Amateur Radio contacts)."
LICENSE = "SUSE-Permissive"

PV = "2.8.6"

RPM_NAME = "tqsl-2.8.6-1.2.aarch64.rpm"
RPM_HASH = "8efd274905511344ec574e093a8d98193fb86ef1ab7f57155da9b0f027df5adb1b42553b2e919d901f622d65aaa2f5ebbc7f2bd9980332656eaeb72a53bedbb8"

RPROVIDES:${PN} += "tqsl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtqsllib.so.2.8.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-html-suse.so.16.0.0 \
libz.so.1"

inherit rpm
