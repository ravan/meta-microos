SUMMARY = "Moo types for numbers"
DESCRIPTION = "A set of numeric types to be used in Moo-based classes. Adapted from \
MooseX::Types::Common::Numeric"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.03"

RPM_NAME = "perl-MooX-Types-MooseLike-Numeric-1.03-1.38.noarch.rpm"
RPM_HASH = "d3adf1d2eaceb5428fa11987f0accf5dc72c248c8f7f2f1a88b74e673b7fa89412368eabb03a8fcd7cc7b40c6cad2faab74378ece7340314dc93c469369ecc72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Types--MooseLike--Numeric \
perl-MooX-Types-MooseLike-Numeric"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-MooX--Types--MooseLike"

inherit rpm
