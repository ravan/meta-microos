SUMMARY = "Intelligently generate a README file from POD"
DESCRIPTION = "This module filters POD to generate a _README_ file, by using POD commands \
to specify which parts are included or excluded from the _README_ file."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.2.3"

RPM_NAME = "perl-Pod-Readme-1.2.3-1.31.noarch.rpm"
RPM_HASH = "d1a33fd5444a57148d56130b1695907397b8a20fa28c338cbc93542d0e5ec2d23a847536c672d4f87cdf349d2333a0f853afb3a29494b5fd9a3fdf55e6e8add1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Readme \
perl-Pod--Readme--Filter \
perl-Pod--Readme--Plugin \
perl-Pod--Readme--Plugin--changes \
perl-Pod--Readme--Plugin--requires \
perl-Pod--Readme--Plugin--version \
perl-Pod--Readme--Types \
perl-Pod-Readme"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Changes \
perl-CPAN--Meta \
perl-Class--Method--Modifiers \
perl-File--Slurp \
perl-Getopt--Long--Descriptive \
perl-List--Util \
perl-Module--CoreList \
perl-Moo \
perl-Moo--Role \
perl-MooX--HandlesVia \
perl-Path--Tiny \
perl-Pod--Simple \
perl-Role--Tiny \
perl-Try--Tiny \
perl-Type--Tiny \
perl-Types--Standard \
perl-namespace--autoclean"

inherit rpm
