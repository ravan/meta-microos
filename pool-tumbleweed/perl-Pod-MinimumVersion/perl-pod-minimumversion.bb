SUMMARY = "Perl version for POD directives used"
DESCRIPTION = "'Pod::MinimumVersion' parses the POD in a Perl script, module, or document, \
and reports what version of Perl is required to process the directives in \
it with 'pod2man' etc."
LICENSE = "GPL-3.0-or-later"

PV = "50"

RPM_NAME = "perl-Pod-MinimumVersion-50-2.28.noarch.rpm"
RPM_HASH = "3f48d5f5dc143c898df09577eedcdb175fd482ddfead17ac7fdc39ebff34a7c480b3578003178ecb5e2c1494edd5c7d120d039303002220e1c785957a862a7c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--MinimumVersion \
perl-Pod--MinimumVersion--Parser \
perl-Pod--MinimumVersion--Report \
perl-Pod-MinimumVersion"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-IO--String \
perl-Pod--Parser \
perl-version"

inherit rpm
