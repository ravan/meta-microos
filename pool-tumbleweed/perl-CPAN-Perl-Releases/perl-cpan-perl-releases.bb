SUMMARY = "Mapping Perl releases on CPAN to the location of the tarballs"
DESCRIPTION = "CPAN::Perl::Releases is a module that contains the mappings of all 'perl' \
releases that have been uploaded to CPAN to the 'authors/id/' path that the \
tarballs reside in. \
 \
This is static data, but newer versions of this module will be made \
available as new releases of 'perl' are uploaded to CPAN."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.202.608.200"

RPM_NAME = "perl-CPAN-Perl-Releases-5.202.608.200-1.1.noarch.rpm"
RPM_HASH = "dab7f1bfdf789012a1986b779324b1b43b694a85805a6430ad8fc0098f215c2fca48e2adba3475f87380a6f34bc6604040127a10744fe0191fab6590b26f9325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Perl--Releases \
perl-CPAN-Perl-Releases"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
