SUMMARY = "Path::Class type library for Moose"
DESCRIPTION = "MooseX::Types::Path::Class creates common Moose types, coercions and option \
specifications useful for dealing with Path::Class objects as Moose \
attributes. \
 \
Coercions (see Moose::Util::TypeConstraints) are made from both 'Str' and \
'ArrayRef' to both Path::Class::Dir and Path::Class::File objects. If you \
have MooseX::Getopt installed, the 'Getopt' option type ('=s') will be \
added for both Path::Class::Dir and Path::Class::File."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.09"

RPM_NAME = "perl-MooseX-Types-Path-Class-0.09-1.37.noarch.rpm"
RPM_HASH = "24a54d734ce440d8d644ad5275f74199c82ab7e6a8cdb35720ded3f11a5aa955870389836cb1b5d13685214499868217c8c502cc3f9f27dba52f818bd94e7952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Path--Class \
perl-MooseX-Types-Path-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-Path--Class"

inherit rpm
