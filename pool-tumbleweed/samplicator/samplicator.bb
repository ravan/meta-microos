SUMMARY = "Tool to send copies of (UDP) datagrams to multiple receivers"
DESCRIPTION = "This program receives UDP datagrams on a given port, and resends \
those datagrams to a specified set of receivers. \
In addition, a sampling divisor N may be specified individually for each \
receiver, which will then only receive one in N of the received packets. \
Optional spoofing is also supported."
LICENSE = "GPL-2.0-only"

PV = "1.3.8rc1+git.20171112"

RPM_NAME = "samplicator-1.3.8rc1+git.20171112-4.9.aarch64.rpm"
RPM_HASH = "de2a74a3163f53b9253b72b89acf002dc781736e62308610ad4a1dffa3b3cfae169c7576bf23771f7e5fce10422f3dfbcc46681822e7282470584a6cf4f13b67"

RPROVIDES:${PN} += "config-samplicator \
samplicator"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
