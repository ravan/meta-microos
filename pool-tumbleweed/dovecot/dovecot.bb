SUMMARY = "IMAP and POP3 Server Written Primarily with Security in Mind"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This is a wrapper package that will just handle common things for all \
versioned dovecot packages."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.4"

RPM_NAME = "dovecot-2.4-3.3.noarch.rpm"
RPM_HASH = "f6e826800bc0c40c7cda93517c5e8bb05ed8ca0c8a2f1dc1872c35df4bebafbad547cb533adb1bd44dfa1a99e92fa011b62bf991eca9664b1ab120eb1507bf43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dovecot \
dovecot \
group-dovecot \
group-dovenull \
user-dovecot \
user-dovenull"

RDEPENDS:${PN} += "/usr/bin/sh \
dovecot-implementation \
shadow \
sysuser-shadow"

inherit rpm
