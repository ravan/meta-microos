SUMMARY = "Parse cpanfile"
DESCRIPTION = "Module::CPANfile is a tool to handle cpanfile format to load application \
specific dependencies, not just for CPAN distributions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1004"

RPM_NAME = "perl-Module-CPANfile-1.1004-1.33.noarch.rpm"
RPM_HASH = "a05b0ee8b3dbfb3acaa798aec64ad631b81965c8cb682ecc6416a5953b094b1785a25e007c07671b60e07daac9ba87535054f32dcc9f83c42885d84418db2c6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--CPANfile \
perl-Module--CPANfile--Environment \
perl-Module--CPANfile--Prereq \
perl-Module--CPANfile--Prereqs \
perl-Module--CPANfile--Requirement \
perl-Module-CPANfile"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Meta \
perl-CPAN--Meta--Prereqs \
perl-parent"

inherit rpm
