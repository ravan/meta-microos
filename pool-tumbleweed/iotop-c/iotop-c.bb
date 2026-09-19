SUMMARY = "Simple top-like I/O monitor (implemented in C)"
DESCRIPTION = "iotop-c does for I/O usage what top(1) does for CPU usage. It watches I/O usage \
information output by the Linux kernel and displays a table of current I/O usage \
by processes on the system. It is handy for answering the question 'Why is the \
disk churning so much?'. \
 \
iotop-c requires a Linux kernel built with the CONFIG_TASKSTATS, \
CONFIG_TASK_DELAY_ACCT, CONFIG_TASK_IO_ACCOUNTING and CONFIG_VM_EVENT_COUNTERS \
config options on. \
 \
iotop-c is an alternative re-implementation of iotop in C, optimized for \
performance. Normally a monitoring tool intended to be used on a system under \
heavy stress should use the least additional resources as possible."
LICENSE = "GPL-2.0-or-later"

PV = "1.31"

RPM_NAME = "iotop-c-1.31-1.4.aarch64.rpm"
RPM_HASH = "0826d0f270cf33b1c5632d8532ad9a2618a06566125808f58240b0e34c73c84f1ae8e37559f1cfe44fe310bd819bd62367c013d305473302667d300f6d2a67d3"

RPROVIDES:${PN} += "iotop-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
