SUMMARY = "DKIMproxy is an SMTP-proxy that implements the DKIM and DomainKeys standards"
DESCRIPTION = "DKIMproxy is an SMTP-proxy that signs and/or verifies emails, using the \
Mail::DKIM module. It is designed for Postfix, but should work with any \
mail server. It comprises two separate proxies, an 'outbound' proxy for \
signing outgoing email, and an 'inbound' proxy for verifying signatures \
of incoming email. With Postfix, the proxies can operate as either \
Before-Queue or After-Queue content filters."
LICENSE = "GPL-2.0-only"

PV = "1.4.1"

RPM_NAME = "dkimproxy-1.4.1-21.7.noarch.rpm"
RPM_HASH = "1a34ca10fafd5ed456a451c68862876d904a3e5a29eab351968b737c1adf6f3e7c8edefe4e5447aca1ad7d818896816a559e7bb5840dcc56da7913d8d687e408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dkimproxy \
perl-LookupMap \
perl-MSDW--SMTP--Client \
perl-MSDW--SMTP--Server \
perl-MySmtpProxyServer \
perl-MySmtpServer"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
git-core \
perl-Mail-DKIM \
perl-Net-Server \
pwdutils"

inherit rpm
