SUMMARY = "Search Mailboxes for a Particular E-Mail"
DESCRIPTION = "Grepmail searches a normal, gzipped, bzipped, or tzipped mailbox for a \
given regular expression, and returns any e-mails that match that \
expression. Piped input is allowed and date restrictions are supported."
LICENSE = "GPL-2.0+"

PV = "5.3104"

RPM_NAME = "grepmail-5.3104-3.12.noarch.rpm"
RPM_HASH = "0039f7923930368b4c0a55ed9597b61d508e3d12891ed09676a3b5a2d47d4d57e4b2774f1724d4a152b7593dcef485ae54cdab68f5da43b6286dc90ba57bdaa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grepmail"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Date--Parse \
perl-Mail--Mbox--MessageParser \
perl-Time--Local"

inherit rpm
