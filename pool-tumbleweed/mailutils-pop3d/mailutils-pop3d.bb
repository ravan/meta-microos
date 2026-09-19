SUMMARY = "POP3 daemon from GNU Mailutils"
DESCRIPTION = "The 'pop3d' daemon implements the Post Office Protocol Version 3 server."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.21"

RPM_NAME = "mailutils-pop3d-3.21-1.6.aarch64.rpm"
RPM_HASH = "2e2d14bbc24282c123d84f72fe390d6966b3259c09aa1cce69582676c2e130e455eacdf268efd4081368530d07a019df26c0c7af92e8d5f3b1b83321066e2dff"

RPROVIDES:${PN} += "mailutils-pop3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmailutils.so.9 \
libmu-auth.so.9 \
libmu-dbm.so.9 \
libmu-dotmail.so.9 \
libmu-maildir.so.9 \
libmu-mbox.so.9 \
libmu-mh.so.9 \
libmuaux.so.9 \
libunistring.so.5 \
libwrap.so.0"

inherit rpm
