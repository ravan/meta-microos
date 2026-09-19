SUMMARY = "The World-Wide Web library for Perl"
DESCRIPTION = "The World-Wide Web library for Perl"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.830.0"

RPM_NAME = "perl-libwww-perl-6.830.0-1.3.noarch.rpm"
RPM_HASH = "9a9cb1f1e900b1934be0a37121d47550fcf1065ed72d88b0135c5c5a76671851c6e281ca123227575d2319736ce4912d412afa656fabcaecff06680c5c9ff5dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-LWP \
perl-LWP--Authen--Basic \
perl-LWP--Authen--Digest \
perl-LWP--Authen--Ntlm \
perl-LWP--ConnCache \
perl-LWP--Debug \
perl-LWP--Debug--TraceHTTP \
perl-LWP--DebugFile \
perl-LWP--MemberMixin \
perl-LWP--Protocol \
perl-LWP--Protocol--cpan \
perl-LWP--Protocol--data \
perl-LWP--Protocol--file \
perl-LWP--Protocol--ftp \
perl-LWP--Protocol--gopher \
perl-LWP--Protocol--http \
perl-LWP--Protocol--loopback \
perl-LWP--Protocol--mailto \
perl-LWP--Protocol--nntp \
perl-LWP--Protocol--nogo \
perl-LWP--RobotUA \
perl-LWP--Simple \
perl-LWP--UserAgent \
perl-libwww-perl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Encode--Locale \
perl-File--Listing \
perl-HTML--Entities \
perl-HTML--HeadParser \
perl-HTTP--Cookies \
perl-HTTP--Date \
perl-HTTP--Message \
perl-HTTP--Negotiate \
perl-HTTP--Request \
perl-HTTP--Request--Common \
perl-HTTP--Response \
perl-HTTP--Status \
perl-LWP--MediaTypes \
perl-Module--Load \
perl-Net--HTTP \
perl-Try--Tiny \
perl-URI \
perl-URI--Escape \
perl-WWW--RobotRules \
perl-parent"

inherit rpm
