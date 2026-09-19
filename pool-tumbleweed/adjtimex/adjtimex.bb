SUMMARY = "Kernel time variables configuration utility"
DESCRIPTION = "This program gives you raw access to the kernel time variables. For \
a machine connected to the Internet, or equipped with a precision \
oscillator or radio clock, the best way to keep the system clock \
correct is with ntpd. However, for a standalone or intermittently \
connected machine, you may use adjtimex instead to at least correct \
for systematic drift. adjtimex can optionally adjust the system clock \
using the CMOS clock as a reference, and can log times for long-term \
estimation of drift rates."
LICENSE = "GPL-2.0-or-later"

PV = "1.29"

RPM_NAME = "adjtimex-1.29-9.6.aarch64.rpm"
RPM_HASH = "b1c491d25255762b63cf998bcf31bbca0161d5506599a12382e694861710ca0e3bb2a32ca7e137ac135dffb93ddaff7a747d4926b6ebdad3f206ff083ffe73e8"

RPROVIDES:${PN} += "adjtimex \
util-linux-/usr/sbin/adjtimex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
