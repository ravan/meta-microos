SUMMARY = "Tiny proxy servers set"
DESCRIPTION = "Universal proxy server with HTTP, HTTPS, SOCKS v5, FTP,PO P3, UDP and TCP \
portmapping, access control, bandwith control, traffic limitation and accounting \
based on username, client IP, target IP, day time, day of week, etc."
LICENSE = "Apache-2.0 | BSD-3-Clause | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.9.9"

RPM_NAME = "3proxy-0.9.9-1.1.aarch64.rpm"
RPM_HASH = "24d88b807ec908513e9c00f3edf4681971571a18301222602dc3369f0d8896e1ff75ae9f32fa4b1f107721514e7cac913fca981a029dd2ce76b74babbcd83e80"

RPROVIDES:${PN} += "3proxy \
config-3proxy \
group-proxy \
user-proxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpam.so.0 \
libpcre2-8.so.0 \
libssl.so.3 \
shadow"

inherit rpm
