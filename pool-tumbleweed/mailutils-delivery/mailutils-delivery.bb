SUMMARY = "Mailutils's delivery agents"
DESCRIPTION = "The name 'maidag' stands for Mail delivery agent.  It is a \
general-purpose MDA offering a number of features. It can operate \
both in traditional mode, reading a message from standard input, \
and in LMTP mode.  'Maidag' is able to deliver mail to any mailbox \
format supported by GNU Mailutils. These formats, among others, \
include 'smtp://', 'prog://' and 'sendmail://', which are equivalent to \
forwarding a message over SMTP to a remote node."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.21"

RPM_NAME = "mailutils-delivery-3.21-1.6.aarch64.rpm"
RPM_HASH = "fe34fad6ec84655f67f9e49f1bddd91df7cc20c137609231d6f1eeb54f2cdcf04f68105e123e8336c9af2121d33db8013b9d5635dc9a0f3914340e78d1f98c7b"

RPROVIDES:${PN} += "mailutils-delivery"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libmailutils.so.9 \
libmu-auth.so.9 \
libmu-dbm.so.9 \
libmu-dotmail.so.9 \
libmu-imap.so.9 \
libmu-maildir.so.9 \
libmu-mailer.so.9 \
libmu-mbox.so.9 \
libmu-mh.so.9 \
libmu-pop.so.9 \
libmu-py.so.9 \
libmu-scm.so.9 \
libmu-sieve.so.9 \
libwrap.so.0"

inherit rpm
