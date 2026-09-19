SUMMARY = "A highly DNS-, DoS- and abuse-aware loadbalancer"
DESCRIPTION = "dnsdist is a highly DNS-, DoS- and abuse-aware loadbalancer. Its goal in life \
is to route traffic to the best server, delivering top performance to \
legitimate users while shunting or blocking abusive traffic. \
 \
dnsdist is dynamic, in the sense that its configuration can be changed at \
runtime, and that its statistics can be queried from a console-like interface."
LICENSE = "GPL-2.0-only"

PV = "2.0.7"

RPM_NAME = "dnsdist-2.0.7-1.1.aarch64.rpm"
RPM_HASH = "83465744ff0e36ea551ef50554590bf15d72430b8ebc966ba3c106572f577f03d1564aae70345756d666ce140a622cac964e3f8c7a4e768610f8141842f98316"

RPROVIDES:${PN} += "config-dnsdist \
dnsdist \
group-dnsdist \
user-dnsdist"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libedit.so.0 \
libfstrm.so.0 \
libgcc-s.so.1 \
libgnutls.so.30 \
liblmdb-0.9.35.so \
libluajit-5.1.so.2 \
libm.so.6 \
libnetsnmp.so.45 \
libnetsnmpagent.so.45 \
libnghttp2.so.14 \
libre2.so.11 \
libsodium.so.26 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
sysuser-shadow"

inherit rpm
