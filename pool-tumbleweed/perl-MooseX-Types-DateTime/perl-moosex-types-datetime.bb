SUMMARY = "DateTime related constraints and coercions for Moose"
DESCRIPTION = "This module packages several Moose::Util::TypeConstraints with coercions, \
designed to work with the DateTime suite of objects. \
 \
Namespaced Example: \
 \
    use MooseX::Types::DateTime; \
 \
    has time_zone => ( \
        isa => 'DateTime::TimeZone', \
        is => 'rw', \
        coerce => 1, \
    ); \
 \
    Class->new( time_zone => 'Africa/Timbuktu' );"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.140.0"

RPM_NAME = "perl-MooseX-Types-DateTime-0.140.0-1.5.noarch.rpm"
RPM_HASH = "73dcb9c04f8c1456bd615db2c5edb4bb424faf7b8ca193fcf73c437a8150854d16941e929bff4a62f14ec532a95b88ebe791e4973b49326aa1b86123da44113c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--DateTime \
perl-MooseX-Types-DateTime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DateTime \
perl-DateTime--Duration \
perl-DateTime--Locale \
perl-DateTime--TimeZone \
perl-Moose \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-namespace--clean"

inherit rpm
