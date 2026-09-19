SUMMARY = "MySQL support for Dovecot"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the files needed for MySQL support."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.4.5"

RPM_NAME = "dovecot24-backend-mysql-2.4.5-2.1.aarch64.rpm"
RPM_HASH = "8a1a5e982f003ece28edb20ce0ee88b6632e3679179e8e3716c28d074ea2e06aca64e9c337863f14256e9519a165f79a66f4d1edd4edfb1e9107b126a4b85e95"

RPROVIDES:${PN} += "dovecot-backend-mysql \
dovecot-sql-backend \
dovecot24-backend-mysql \
libdriver-mysql.so"

RDEPENDS:${PN} += "dovecot24 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
