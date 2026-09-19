SUMMARY = "Mailbox scanning tool"
DESCRIPTION = "mboxgrep is a small utility that scans a mailbox for messages matching a \
regular expression. Found messages can be either displayed on standard output, \
counted, deleted, piped to a shell command or written to another mailbox."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.13"

RPM_NAME = "mboxgrep-0.7.13-1.5.aarch64.rpm"
RPM_HASH = "d0b0facf08ee7884ab97ccc5a3c3b7795ceaf53f7ba5d5fd106bea52b4bf3225ac87de49266fdde20b40fe1853b086421ca0b320d4856b53188058d8e2da4bb3"

RPROVIDES:${PN} += "mboxgrep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libpcre2-32.so.0 \
libz.so.1"

inherit rpm
