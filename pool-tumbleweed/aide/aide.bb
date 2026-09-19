SUMMARY = "Advanced Intrusion Detection Environment"
DESCRIPTION = "AIDE is an intrusion detection system that checks file integrity."
LICENSE = "GPL-2.0-or-later"

PV = "0.19.2"

RPM_NAME = "aide-0.19.2-2.5.aarch64.rpm"
RPM_HASH = "d637f1f175c42cfd07e8d161a8f1064fa576eb2903e5a4c9818ecd0f1759fa021e389ef1ccd4282805aa2b8f38dbebd36e349a08da4c74d2e5e9f25c6a85164b"

RPROVIDES:${PN} += "aide \
config-aide"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libm.so.6 \
libpcre2-8.so.0 \
libselinux.so.1 \
libz.so.1"

inherit rpm
