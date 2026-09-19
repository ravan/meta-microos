SUMMARY = "An event dispatching library"
DESCRIPTION = "libivykis is a wrapper over various OS'es implementation of I/O \
readiness notification facilities (such as poll(2), kqueue(2)) and \
can be used for writing portable network servers."
LICENSE = "LGPL-2.1-only"

PV = "0.43.2"

RPM_NAME = "libivykis0-0.43.2-1.5.aarch64.rpm"
RPM_HASH = "9acacb370813fe477f709d927194144d0062b72154a4a7aa2a893ef01249332deb83de360b8cc51483509d640b7a9da564e7cac8bd319e249db24e90d46558bd"

RPROVIDES:${PN} += "libivykis.so.0 \
libivykis0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
