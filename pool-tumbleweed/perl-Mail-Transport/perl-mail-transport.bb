SUMMARY = "Email message exchange"
DESCRIPTION = "Objects which extend 'Mail::Transport' implement sending and/or receiving \
of messages, using various protocols. \
 \
*Be aware:* This module versions 4.00 and up is not fully compatible with \
older releases: mainly the exception handling has changed. When you need to \
upgrade, please read _https://github.com/markov2/perl5-Mail-Box/wiki/_ \
*Version 3 is still maintained* and may see new releases as well. \
 \
Mail::Transport::Send extends this class, and offers general functionality \
for send protocols, like SMTP. Mail::Transport::Receive also extends this \
class, and offers receive method. Some transport protocols will implement \
both sending and receiving. \
 \
Extends 'DESCRIPTION' in Mail::Reporter."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.10.0"

RPM_NAME = "perl-Mail-Transport-4.10.0-1.3.noarch.rpm"
RPM_HASH = "8a66209cd10ac59fd069a35e6f0026780720efa69780ec610f7b335686ade9f5c0edafe16ba65aec067bc86d10fba6efdc67b1745af9ebe710144d800db35fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Transport \
perl-Mail--Transport--Exim \
perl-Mail--Transport--Mailx \
perl-Mail--Transport--Qmail \
perl-Mail--Transport--Receive \
perl-Mail--Transport--SMTP \
perl-Mail--Transport--Send \
perl-Mail--Transport--Sendmail \
perl-Mail-Transport"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Log--Report \
perl-Mail--Reporter \
perl-String--Print"

inherit rpm
