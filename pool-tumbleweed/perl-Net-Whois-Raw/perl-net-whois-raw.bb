SUMMARY = "Get Whois information of domains and IP addresses"
DESCRIPTION = "Net::Whois::Raw queries WHOIS servers about domains. The module supports \
recursive WHOIS queries. Also queries via HTTP is supported for some TLDs. \
 \
Setting the variables $OMIT_MSG and $CHECK_FAIL will match the results \
against a set of known patterns. The first flag will try to omit the \
copyright message/disclaimer, the second will attempt to determine if the \
search failed and return undef in such a case. \
 \
*IMPORTANT*: these checks merely use pattern matching; they will work on \
several servers but certainly not on all of them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.99043"

RPM_NAME = "perl-Net-Whois-Raw-2.99043-1.3.noarch.rpm"
RPM_HASH = "20b2514d2fb8b40354821b071831ca417eac32fcd52e726be03d52dade9415b3bbcbc16a975a5be4d38760d68074116bf306e5bb57d502c2e3757fc4b67b289c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Whois--Raw \
perl-Net--Whois--Raw--Common \
perl-Net--Whois--Raw--Data \
perl-Net-Whois-Raw"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.44.0 \
perl-HTTP--Headers \
perl-HTTP--Request \
perl-IO--Socket--IP \
perl-LWP--UserAgent \
perl-Net--IDN--Punycode \
perl-Regexp--IPv6 \
perl-URI--URL"

inherit rpm
