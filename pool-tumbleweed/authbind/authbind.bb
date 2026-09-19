SUMMARY = "Authentication socket binding to priviledged ports without root"
DESCRIPTION = "Authbind allows a program which does not or should not run as \
root to bind to low-numbered ports in a controlled way. \
 \
http://en.wikipedia.org/wiki/Authbind"
LICENSE = "GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "authbind-2.1.2-4.9.aarch64.rpm"
RPM_HASH = "33f9cfce326be7ad0d3527188d5b162fa9d34c353eea2ed5b47f4f861348af30dabd700c5c098dc1e2ff64d14b466c7602c3d61170fe277413fb172c2c5dcdfd"

RPROVIDES:${PN} += "authbind \
libauthbind.so.1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions"

inherit rpm
