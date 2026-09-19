SUMMARY = "Cloud Authentication support for syslog-ng: pubsub"
DESCRIPTION = "This package provides Cloud Authentication support for syslog-ng, \
currently used for Google PubSub"
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-cloudauth-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "4ae8f51042b54a8186cff47c72c307bc13976d29bfd7767654f70946f0fbe1f158d0ec73f4b647ebacfd19994d473820d3c060b4ef1bfa95bcee93ebbc6c3d7e"

RPROVIDES:${PN} += "syslog-ng-cloudauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libevtlog-4.12.so.0 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libsyslog-ng-4.12.so.0 \
syslog-ng"

inherit rpm
