SUMMARY = "Use Perl::Critic in test programs"
DESCRIPTION = "Test::Perl::Critic wraps the Perl::Critic engine in a convenient subroutine \
suitable for test programs written using the Test::More framework. This \
makes it easy to integrate coding-standards enforcement into the build \
process. For ultimate convenience (at the expense of some flexibility), see \
the criticism pragma. \
 \
If you have an large existing code base, you might prefer to use \
Test::Perl::Critic::Progressive, which allows you to clean your code \
incrementally instead of all at once.. \
 \
If you'd like to try Perl::Critic without installing anything, there is a \
web-service available at http://perlcritic.com. The web-service does not \
support all the configuration features that are available in the native \
Perl::Critic API, but it should give you a good idea of what Perl::Critic \
can do."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.40.0"

RPM_NAME = "perl-Test-Perl-Critic-1.40.0-1.7.noarch.rpm"
RPM_HASH = "f59340045912f3f63745ea69fd56446eeda63e798a77f2dcd261def63218fe1107a5f63e5369079f5f7eeba3c5c7467c660881a976b0a3f56644f0b9bdc8201d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Perl--Critic \
perl-Test-Perl-Critic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-MCE \
perl-Perl--Critic \
perl-Perl--Critic--Utils \
perl-Perl--Critic--Violation \
perl-Test--Builder"

inherit rpm
