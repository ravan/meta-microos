SUMMARY = "Generate a SUSE spec file for a CPAN module"
DESCRIPTION = "*cpanspec* will generate a spec file to build a rpm from a CPAN-style Perl \
module distribution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.84.00.1688930749.8cd1dcd"

RPM_NAME = "cpanspec-1.84.00.1688930749.8cd1dcd-2.12.noarch.rpm"
RPM_HASH = "016dfd4c7f9fec0286d6f4e737003d7e90d26ca59ec21f88e06d9b4f3eef5db31022e59cc2f031723a8961ebd833b528a1f939859c7e3844558a17373c8960ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpanspec \
perl-CPAN2OBS \
perl-PodViewSpec"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl--MODULE-COMPAT-5.44.0 \
perl-Algorithm--Diff \
perl-Archive--Tar \
perl-Archive--Zip \
perl-Class--Accessor--Chained \
perl-File--ShareDir--Install \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Module--Build--Tiny \
perl-Parse--CPAN--Packages \
perl-Perl--PrereqScanner \
perl-Pod--POM \
perl-Pod--Simple--TextContent \
perl-Text--Autoformat \
perl-Text--Capitalize \
perl-YAML \
perl-YAML--XS"

inherit rpm
