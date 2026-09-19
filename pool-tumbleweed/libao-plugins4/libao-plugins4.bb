SUMMARY = "Main output plugins for libao"
DESCRIPTION = "This package contains the main output plugins for libao."
LICENSE = "GPL-2.0+"

PV = "1.2.2+git20180114.d522165"

RPM_NAME = "libao-plugins4-1.2.2+git20180114.d522165-3.9.aarch64.rpm"
RPM_HASH = "81a3de5f7d10d7d3dbc6d8ceecfaad559dc102453c69b91d0290fa43830122182482603aa8d9130d5a946ff9e2addd2f87c7f4730ff23914552c951ead4d1470"

RPROVIDES:${PN} += "libao-plugins4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
