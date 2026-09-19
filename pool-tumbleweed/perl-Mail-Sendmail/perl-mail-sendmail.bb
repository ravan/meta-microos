SUMMARY = "Simple platform independent mailer"
DESCRIPTION = "Simple platform independent e-mail from your perl script. Only requires \
Perl 5 and a network connection. \
 \
Mail::Sendmail takes a hash with the message to send and sends it to your \
mail server. It is intended to be very easy to setup and use. See also \
'FEATURES' below, and as usual, read this documentation. \
 \
There is also a FAQ (see 'NOTES')."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.820.0"

RPM_NAME = "perl-Mail-Sendmail-0.820.0-1.6.noarch.rpm"
RPM_HASH = "e5bee3fb7aef4ecd9a698810534d09b355640137d8037d5b0cf2ab06975f58f5eefec492ab328c79aa626daeb3ee5d8b3c6b39b47fedbd36ca4655bce2779e7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Sendmail \
perl-Mail-Sendmail"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Sys--Hostname--Long \
perl-parent"

inherit rpm
