SUMMARY = "PostgreSQL support for Dovecot"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the files needed for PostgreSQL support."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.4.5"

RPM_NAME = "dovecot24-backend-pgsql-2.4.5-2.1.aarch64.rpm"
RPM_HASH = "7bfa1ac1b90c5014072a12b36b4064606852ad151b4e935d839e347c55013933ab111cd10532188580b4a33a49ce5f752bd8ed6ba1f4c2843f4b8d131f18ef4c"

RPROVIDES:${PN} += "dovecot-backend-pgsql \
dovecot-sql-backend \
dovecot24-backend-pgsql \
libdriver-pgsql.so"

RDEPENDS:${PN} += "dovecot24 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5"

inherit rpm
