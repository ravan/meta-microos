SUMMARY = "Parser for CPAN style change logs"
DESCRIPTION = "It is standard practice to include a Changes file in your distribution. The \
purpose the Changes file is to help a user figure out what has changed \
since the last release. \
 \
People have devised many ways to write the Changes file. A preliminary \
specification has been created (CPAN::Changes::Spec) to encourage module \
authors to write clear and concise Changes. \
 \
This module will help users programmatically read and write Changes files \
that conform to the specification."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.500005"

RPM_NAME = "perl-CPAN-Changes-0.500005-1.7.noarch.rpm"
RPM_HASH = "703e4f646b9990fe04355c3e83ee87604688abdaa2490a8120298faa7d361c2e637389e60b96589ebfae563db9057f9b9ee8519c24f27139fba8ac2f32fd0945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Changes \
perl-CPAN--Changes--Entry \
perl-CPAN--Changes--Group \
perl-CPAN--Changes--HasEntries \
perl-CPAN--Changes--Parser \
perl-CPAN--Changes--Release \
perl-CPAN-Changes \
perl-Test--CPAN--Changes"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Module--Runtime \
perl-Moo \
perl-Sub--Quote \
perl-Types--Standard"

inherit rpm
