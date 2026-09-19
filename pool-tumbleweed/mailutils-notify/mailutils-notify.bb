SUMMARY = "Mailutils's incoming e-mail notification daemon"
DESCRIPTION = "Comsatd is the server which receives reports of incoming mail and \
notifies users wishing to get this service."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.21"

RPM_NAME = "mailutils-notify-3.21-1.6.aarch64.rpm"
RPM_HASH = "6923e89a1820894dc59772d5be6f8030a3cec40e7e5a85e499a65d459c1216ce7dbb319e5a7cf1c121d03999bb41a77ae4ef7f0694fe1e359ba04dc3c262ba3d"

RPROVIDES:${PN} += "mailutils-notify"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmailutils.so.9 \
libmu-dotmail.so.9 \
libmu-imap.so.9 \
libmu-maildir.so.9 \
libmu-mbox.so.9 \
libmu-mh.so.9 \
libmu-pop.so.9"

inherit rpm
