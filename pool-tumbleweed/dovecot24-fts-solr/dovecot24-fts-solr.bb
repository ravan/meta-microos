SUMMARY = "Fulltext search support via solr"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the files needed for fulltext search support via solr."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.4.5"

RPM_NAME = "dovecot24-fts-solr-2.4.5-2.1.aarch64.rpm"
RPM_HASH = "f98395ee5b735a6e1b28a0eda5f489ce5825566bd1f28d83e31e1fa3abfe062d16a65355dbd4d40e57cef0e42c310f5c20f922084d32512cf6fb3fe96f79a1f4"

RPROVIDES:${PN} += "dovecot-fts-backend \
dovecot-fts-solr \
dovecot24-fts-solr \
lib21-fts-solr-plugin.so"

RDEPENDS:${PN} += "dovecot24 \
dovecot24-fts \
ld-linux-aarch64.so.1 \
lib20-fts-plugin.so \
libc.so.6 \
libexpat.so.1"

inherit rpm
