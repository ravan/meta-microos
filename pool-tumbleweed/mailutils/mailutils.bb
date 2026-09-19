SUMMARY = "GNU Mailutils"
DESCRIPTION = "Mailutils is a set of utilities and daemons for processing e-mail. \
 \
All Mailutils programs are able to operate on mailboxes of various \
formats, including UNIX maildrops, maildir, and transparently \
accessed remote mailboxes (IMAP4, POP3, SMTP). \
 \
Included is an implementation of the traditional UNIX mail reader, \
'mail', command line utilities such as 'frm', 'messages', 'readmsg', \
as well as 'sieve', a flexible utility for filtering the incoming \
mail. \
 \
A special feature of Mailutils is an implementation of the \
MH Message Handling System, which combines the UNIX \
philosophy with a flexibility of Mailutils libraries, thus \
allowing to incorporate mail from remote mailboxes. \
 \
For system administrators, Mailutils provides a set of daemons \
for delivering and reading electronic mail, including \
pop3d, imap4d and a universal mail delivery agent, called maidag."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.21"

RPM_NAME = "mailutils-3.21-1.6.aarch64.rpm"
RPM_HASH = "7378cb7dab39fb2a8eb6dfd00bbb44950ff71e636c36b7dd857229e30bf5f289648e49ba5047f128a1167105b5907e5678fd14820672751f1d379f3990ef3271"

RPROVIDES:${PN} += "mailutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
cups \
guile \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfribidi.so.0 \
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
libmu-sieve.so.9 \
libmuaux.so.9 \
libreadline.so.8 \
libunistring.so.5 \
python-abi"

inherit rpm
