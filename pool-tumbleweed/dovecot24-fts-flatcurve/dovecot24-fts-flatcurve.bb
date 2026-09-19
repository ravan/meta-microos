SUMMARY = "Fulltext search support flatcurve plugin"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the files needed for fulltext search support squat plugin."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.4.5"

RPM_NAME = "dovecot24-fts-flatcurve-2.4.5-2.1.aarch64.rpm"
RPM_HASH = "392b7e7689766ccb5a346cceacbbf646f680cb179d952d2acacf7df596f2ffee48d444fee005eaebed668837be1303918766f99dc6c67cd49c109ba9b9ab5eb0"

RPROVIDES:${PN} += "dovecot-fts-backend \
dovecot-fts-flatcurve \
dovecot24-fts-flatcurve \
lib21-fts-flatcurve-plugin.so \
libdoveadm-fts-flatcurve-plugin.so"

RDEPENDS:${PN} += "dovecot24 \
dovecot24-fts \
ld-linux-aarch64.so.1 \
lib20-fts-plugin.so \
libc.so.6 \
libdovecot.so.0 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30"

inherit rpm
