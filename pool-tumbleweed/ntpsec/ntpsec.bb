SUMMARY = "Improved implementation of Network Time Protocol"
DESCRIPTION = "A more secure implementation of NTP, derived from NTP Classic, Dave \
Mills’s original."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.5"

RPM_NAME = "ntpsec-1.2.5-1.1.aarch64.rpm"
RPM_HASH = "86d2ccee2d2e641994e5573dea3f5ac98029ab9ba0261b9aefd731231d4a007445049224c6471a48b499000905a38fd38e6425f5279037803b0c024ca64ca60d"

RPROVIDES:${PN} += "config-ntpsec \
ntp-daemon \
ntpsec"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libdns-sd.so.1 \
libm.so.6 \
libnss-usrfiles2 \
libseccomp.so.2 \
libssl.so.3 \
netcfg \
ntpsec-utils \
user-ntp"

inherit rpm
