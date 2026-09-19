SUMMARY = "Various ancient e-mail related modules"
DESCRIPTION = "MailTools is a bundle: an ancient form of combining packages into one \
distribution. Gladly, it can be distributed as if it is a normal \
distribution as well. \
 \
*Be warned:* The code you find here is very old. It works for simple \
emails, but when you start with new code then please use more sofisticated \
libraries. The main reason that you still find this code on CPAN, is \
because many books use it as example."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.220.0"

RPM_NAME = "perl-MailTools-2.220.0-1.10.noarch.rpm"
RPM_HASH = "e6d554c90c377c00f69d49502051985f9f0975bcd6532ac717b5234368b16c4ff605fd541c7e528bee4382dbc66c0b6f9db0dfc9788ad67dc31c1c30f3bb2445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Address \
perl-Mail--Cap \
perl-Mail--Field \
perl-Mail--Field--AddrList \
perl-Mail--Field--Date \
perl-Mail--Field--Generic \
perl-Mail--Filter \
perl-Mail--Header \
perl-Mail--Internet \
perl-Mail--Mailer \
perl-Mail--Mailer--qmail \
perl-Mail--Mailer--rfc822 \
perl-Mail--Mailer--sendmail \
perl-Mail--Mailer--smtp \
perl-Mail--Mailer--smtp--pipe \
perl-Mail--Mailer--smtps \
perl-Mail--Mailer--smtps--pipe \
perl-Mail--Mailer--testfile \
perl-Mail--Mailer--testfile--pipe \
perl-Mail--Send \
perl-Mail--Util \
perl-MailTools"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Date--Format \
perl-Date--Parse"

inherit rpm
