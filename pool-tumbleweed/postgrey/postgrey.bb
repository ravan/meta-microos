SUMMARY = "Postfix greylisting policy server"
DESCRIPTION = "Postgrey is a Postfix policy server implementing greylisting. When a \
request for delivery of a mail is received by Postfix via SMTP, the \
triplet CLIENT_IP / SENDER / RECIPIENT is built. If it is the first \
time that this triplet is seen, or if the triplet was first seen less \
than 5 minutes, then the mail gets rejected with a temporary error. \
Hopefully spammers or viruses will not try again later, as it is \
however required per RFC. \
 \
The following features compared with greylist.pl from Postfix 2.1.1 are \
new: Safe database, automatic maintenance, whitelists, lookup by \
subnet, auto-whitelisting of clients, only Berkeley DB and no large \
mysql nor postgresql DB needed."
LICENSE = "GPL-2.0-or-later"

PV = "1.37"

RPM_NAME = "postgrey-1.37-10.8.noarch.rpm"
RPM_HASH = "c3180e951edf441e7dbb25a3ce1b20c21455a2e865bd20b5726eafbe0b80551d8c54afaeb8519965cf1b410ecbca4562bb7be9f3b3e87d0f83aad05c78bd7841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postgrey \
postgrey \
user-postgrey"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-nogroup \
group-postfix \
perl \
perl-BerkeleyDB \
perl-IO-Multiplex \
perl-Net-DNS \
perl-Net-Server \
perl-NetAddr-IP"

inherit rpm
