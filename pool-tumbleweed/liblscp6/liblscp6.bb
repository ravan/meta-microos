SUMMARY = "LinuxSampler Control Protocol Library"
DESCRIPTION = "liblscp is an implementation of the LinuxSampler control protocol, \
proposed as a C language API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "liblscp6-1.0.1-1.4.aarch64.rpm"
RPM_HASH = "aa2f8b99a6037f10ec4d5cbb4c1770a6dcb8146b373eb14a48141623a541d305f1d2ced597f173f328a550afaed6b18a6cd0f041a6340f5ce4ef68bf111710de"

RPROVIDES:${PN} += "liblscp.so.6 \
liblscp6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
