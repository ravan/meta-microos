SUMMARY = "Fulltext search support base plugin"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the base plugin needed for fulltext search support"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.4.5"

RPM_NAME = "dovecot24-fts-2.4.5-2.1.aarch64.rpm"
RPM_HASH = "a71e47dd8611d0a4f569ff94556f01f52e6331d1010872e61c0bc3a50eaf63cdaebfdf0f1198d26b0129def3aff3265888de70524a5617dec5ecf771f847c76b"

RPROVIDES:${PN} += "dovecot24-fts \
lib20-doveadm-fts-plugin.so \
lib20-fts-plugin.so"

RDEPENDS:${PN} += "dovecot24 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdovecot-language.so.0"

inherit rpm
