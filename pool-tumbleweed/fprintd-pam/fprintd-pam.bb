SUMMARY = "PAM module for fingerprint authentication"
DESCRIPTION = "PAM module that uses the fprintd D-Bus service for fingerprint \
authentication."
LICENSE = "GPL-2.0-or-later"

PV = "1.94.5"

RPM_NAME = "fprintd-pam-1.94.5-1.4.aarch64.rpm"
RPM_HASH = "2f1780823fbc7a8fbfb53f99aab7d65d9a14a3fb8187c3d8332f83ecd4af4632799dd23bb87ceb4e8add7a6def34c430d89862fc454aa5a968b4e3c137dfa54f"

RPROVIDES:${PN} += "fprintd-pam \
pam-fp \
pam-fprint \
pam-thinkfinger"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
fprintd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
libsystemd.so.0 \
pam \
pam-config"

inherit rpm
