SUMMARY = "Perl extension for retrieving terminal size (Perl version)"
DESCRIPTION = "Yet another implementation of 'Term::Size'. Now in pure Perl, with the \
exception of a C probe run on build time."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.031"

RPM_NAME = "perl-Term-Size-Perl-0.031-2.25.noarch.rpm"
RPM_HASH = "cbb6edf4f39bbfc0aec56bacbc00676a233a7fd4ecaf6a5dc98dc85a0dc052b13989ce4f2b32087a97c93fc2fcbc312374dfb018adc936470824ba91138a5da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--Size--Perl \
perl-Term--Size--Perl--Params \
perl-Term-Size-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
