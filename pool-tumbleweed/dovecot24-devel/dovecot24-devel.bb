SUMMARY = "Development files for Dovecot plugins"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the file needed to compile plugins outside of the \
dovecot tree."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.4.5"

RPM_NAME = "dovecot24-devel-2.4.5-2.1.aarch64.rpm"
RPM_HASH = "dafcefdd74186e31785d51d9b9a7b4961f942f0a23eda8344429360741d208d60eb3a951b2dd53f731ea2c73ee87cb50b94e08807e362bebaae7263b6eeea992"

RPROVIDES:${PN} += "dovecot-devel \
dovecot24-devel"

RDEPENDS:${PN} += "dovecot24"

inherit rpm
