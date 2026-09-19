SUMMARY = "A dynamic library for accessing POSIX Access Control Lists"
DESCRIPTION = "This package contains the libacl.so dynamic library which contains the \
POSIX 1003.1e draft standard 17 functions for manipulating access \
control lists."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libacl1-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "204bec5e75c373a6ebb738feccf8513f1938db8c0dfac51f478624b5b150752f21e407bdc41eafc098d417f700f9cde92d5b7f0cc48689d9373a4f6536da93a3"

RPROVIDES:${PN} += "libacl \
libacl.so.1 \
libacl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
