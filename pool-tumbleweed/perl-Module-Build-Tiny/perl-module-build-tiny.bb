SUMMARY = "Tiny replacement for Module::Build"
DESCRIPTION = "Many Perl distributions use a Build.PL file instead of a Makefile.PL file \
to drive distribution configuration, build, test and installation. \
Traditionally, Build.PL uses Module::Build as the underlying build system. \
This module provides a simple, lightweight, drop-in replacement. \
 \
Whereas Module::Build has over 6,700 lines of code; this module has less \
than 200, yet supports the features needed by most distributions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.53.0"

RPM_NAME = "perl-Module-Build-Tiny-0.53.0-1.4.noarch.rpm"
RPM_HASH = "2bba2d4497bca2de83e0ee29f7cdf0ccfcdb384fc5c6277577dcfd840ae9e88e4d2945e2bea74f4362b4d18b94f1fc28128b427b454afef97f41355dc2a7fb19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--Tiny \
perl-Module-Build-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Meta \
perl-ExtUtils--CBuilder \
perl-ExtUtils--Config \
perl-ExtUtils--Helpers \
perl-ExtUtils--InstallPaths \
perl-ExtUtils--ParseXS \
perl-Getopt--Long \
perl-JSON--PP \
perl-TAP--Harness--Env"

inherit rpm
