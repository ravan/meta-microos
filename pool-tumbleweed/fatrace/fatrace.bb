SUMMARY = "System wide file access event reporting utility"
DESCRIPTION = "The fatrace trace uses fanotify, a couple of /proc lookups and some \
glue to trace file access events system-wide, in an effort to \
identify processes which keep waking up the disk even when the \
computer is idle. \
 \
By default, it monitors the whole system, i.e. all mounts except \
virtual ones like /proc, tmpfs, etc. It can be told to monitor just \
the mount of the current directory. The log can be written to a file \
and runtime be capped. Optional time stamps and PID filters are also \
provided."
LICENSE = "GPL-3.0-or-later"

PV = "0.18.0"

RPM_NAME = "fatrace-0.18.0-1.7.aarch64.rpm"
RPM_HASH = "c38ecb40a8cc1dce26b1d30977a21d6b002ec3cecc0bdc5b1b378f02305bea0fe9d559eb7c674df8c449546c56a6388c9632194995f51a8ce0d634c3fd255fd0"

RPROVIDES:${PN} += "fatrace"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
