SUMMARY = "MTA based on msmtp"
DESCRIPTION = "msmtp is an SMTP client that can be used as a plug-in for Mutt and \
other mail user agents.  It forwards mail to an SMTP server that does \
the delivery.  msmtp supports multiple accounts. \
 \
This subpackage provides a mail transfer agent that can be used as \
a minimalistic replacement of sendmail and a minimal SMTP server."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.34"

RPM_NAME = "msmtp-mta-1.8.34-1.1.aarch64.rpm"
RPM_HASH = "501a5003cd75db757139b400cc79ef461ab97c09ad8e7d41670d878a08feb4e129cccf5ca08a644b4a81a25d83f76f8d67b2b363b36f7973db2aa0a8e974c3e7"

RPROVIDES:${PN} += "msmtp-mta \
smtp-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsecret-1.so.0 \
msmtp"

inherit rpm
