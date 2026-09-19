SUMMARY = "IMAP4 daemon from GNU Mailutils"
DESCRIPTION = "GNU 'imap4d' is a daemon implementing IMAP4 rev1 protocol for accessing \
and handling electronic mail messages on a server."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.21"

RPM_NAME = "mailutils-imap4d-3.21-1.6.aarch64.rpm"
RPM_HASH = "0c20871f28a036368fa7f70a08fa5cc50e65f512d179af0ee0c79bd807032167bb4e50b6228acaf9136601a5dd867a1f7026e46a7ddb5b496e11a2c7cfb47db2"

RPROVIDES:${PN} += "mailutils-imap4d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsasl.so.18 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libmailutils.so.9 \
libmu-auth.so.9 \
libmu-dotmail.so.9 \
libmu-maildir.so.9 \
libmu-mbox.so.9 \
libmu-mh.so.9 \
libmuaux.so.9 \
libwrap.so.0"

inherit rpm
