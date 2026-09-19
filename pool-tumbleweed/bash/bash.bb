SUMMARY = "The GNU Bourne-Again Shell"
DESCRIPTION = "Bash is an sh-compatible command interpreter that executes commands \
read from standard input or from a file.  Bash incorporates useful \
features from the Korn and C shells (ksh and csh).  Bash is intended to \
be a conformant implementation of the IEEE Posix Shell and Tools \
specification (IEEE Working Group 1003.2)."
LICENSE = "GPL-3.0-or-later"

PV = "5.3.15"

RPM_NAME = "bash-5.3.15-8.2.aarch64.rpm"
RPM_HASH = "07302e5dbef37d2921626e1ee9c9fc423f6abe1a18dccb4ae2abb81c3cb0c347692839e0d1a6d181ec37948bb4438b6c2ddcd85c929690ed47a353762bde2b11"

RPROVIDES:${PN} += "/usr/bin/bash \
bash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libreadline8"

inherit rpm
