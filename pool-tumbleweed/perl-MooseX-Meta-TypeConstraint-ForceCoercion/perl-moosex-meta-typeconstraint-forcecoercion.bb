SUMMARY = "Force coercion when validating type constraints"
DESCRIPTION = "This class allows to wrap any 'Moose::Meta::TypeConstraint' in a way that \
will force coercion of the value when checking or validating a value \
against it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.01"

RPM_NAME = "perl-MooseX-Meta-TypeConstraint-ForceCoercion-0.01-10.7.noarch.rpm"
RPM_HASH = "a01e737b3fc5203ff2c34bc801156ab45c67d05e353e151d64f8210aa262cb7d2f24aaada3d969984f205f2f9b0c066451fa60c085bbbebc5d794fbc5e1abe15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Meta--TypeConstraint--ForceCoercion \
perl-MooseX-Meta-TypeConstraint-ForceCoercion"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-namespace--autoclean"

inherit rpm
