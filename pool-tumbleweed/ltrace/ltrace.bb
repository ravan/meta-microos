SUMMARY = "Library and system call tracer for programs"
DESCRIPTION = "Ltrace is a program that runs the specified command until it exits. It \
intercepts and records the dynamic library calls that are called by the \
executed process and the signals that are received by that process. It \
can also intercept and print the system calls executed by the program. \
 \
The program to trace need not be recompiled for this, so ltrace can be \
used on binaries for which no source is available. \
 \
This is still a work in progress, so, for example, the tracking to \
child processes may fail or some things may not work as expected."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.1"

RPM_NAME = "ltrace-0.8.1-2.4.aarch64.rpm"
RPM_HASH = "88216985b00b01ddd6c25d1a9101e61a54bcab64270ad5a45078587411d88bcfc9b6590487fb3ba17f21530efd6e0818779aa508d21ce62ec47fd39cacf5ef26"

RPROVIDES:${PN} += "ltrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1"

inherit rpm
