SUMMARY = "Interface to URL shortening sites"
DESCRIPTION = "A Perl interface to various services that shorten URLs. These sites \
maintain databases of long URLs, each of which has a unique identifier."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.094"

RPM_NAME = "perl-WWW-Shorten-3.094-1.26.noarch.rpm"
RPM_HASH = "b83edcacb93cd728a1ffbcb9b72cc5b0393830b73a86df657b523d60d30ff74b7a495304f8414959388c0459f7c72b38a4c8765a4c116525a6024ee8add1cb05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--Shorten \
perl-WWW--Shorten---dead \
perl-WWW--Shorten--LinkToolbot \
perl-WWW--Shorten--Linkz \
perl-WWW--Shorten--MakeAShorterLink \
perl-WWW--Shorten--Metamark \
perl-WWW--Shorten--Qurl \
perl-WWW--Shorten--Qwer \
perl-WWW--Shorten--TinyClick \
perl-WWW--Shorten--TinyURL \
perl-WWW--Shorten--Tinylink \
perl-WWW--Shorten--UserAgent \
perl-WWW--Shorten--generic \
perl-WWW-Shorten"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Getopt--Long \
perl-LWP--UserAgent \
perl-Try--Tiny"

inherit rpm
