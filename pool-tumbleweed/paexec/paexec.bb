SUMMARY = "Utility for task distribution over networks or CPUs"
DESCRIPTION = "A program that processes a list of tasks in parallel \
on different CPUs, computers in a network or whatever else."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "paexec-1.1.6-1.9.aarch64.rpm"
RPM_HASH = "c4e9d68921276bf8a98fcb5c1a5d18ddb336e50156bcb507d251191ae23397e8d5ba1d6f800570531c0505ab04f4dd90ab27dfacb1a76adec70d9c98d0e8f75e"

RPROVIDES:${PN} += "paexec"

RDEPENDS:${PN} += "/usr/bin/runawk \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmaa.so.4 \
runawk"

inherit rpm
