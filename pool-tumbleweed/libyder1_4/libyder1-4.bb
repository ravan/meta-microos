SUMMARY = "Logging library written in C"
DESCRIPTION = "Yder is a logging library where messages can be logged to console, \
files, syslog or journald. \
 \
Yder is single-threaded, which means that only one instance of yder \
logging can be used at the same time in a program."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.20"

RPM_NAME = "libyder1_4-1.4.20-1.11.aarch64.rpm"
RPM_HASH = "efa7c1c4991b14d2388be7020c81ba977ff6253830e4ff1346fa50a05b30f0b396b6f2c77ebccc39d733c8a4b8752c0ef37f47491c4f6bfb46026624c2ccdad2"

RPROVIDES:${PN} += "libyder.so.1.4 \
libyder1-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liborcania.so.2.3 \
libsystemd.so.0"

inherit rpm
