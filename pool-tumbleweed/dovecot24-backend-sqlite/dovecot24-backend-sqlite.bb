SUMMARY = "SQLite support for Dovecot"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the files needed for SQLite support."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.4.5"

RPM_NAME = "dovecot24-backend-sqlite-2.4.5-2.1.aarch64.rpm"
RPM_HASH = "23c82e2afb8df3afb028466dfc903568dad2e474d746c4b61b93ffc2f3da1814fcc51aaddc8a8af3a6358fafb1e51f382112e431719ec0deb4776856251dc244"

RPROVIDES:${PN} += "dovecot-backend-sqlite \
dovecot-sql-backend \
dovecot24-backend-sqlite \
libdriver-sqlite.so"

RDEPENDS:${PN} += "dovecot24 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
