SUMMARY = "Moose role for processing command line options"
DESCRIPTION = "This is a role which provides an alternate constructor for creating objects \
using parameters passed in from the command line."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.780.0"

RPM_NAME = "perl-MooseX-Getopt-0.780.0-1.10.noarch.rpm"
RPM_HASH = "be2ec17b9db890245fffedd8ffc4919ff4ac7d4972810cfc4626bed5319b1e17820f21f9bf4213eb9fd82599ee85b0d90ede55e49a6340d5ad78711c36b6d6c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Getopt \
perl-MooseX--Getopt--Basic \
perl-MooseX--Getopt--Dashes \
perl-MooseX--Getopt--GLD \
perl-MooseX--Getopt--Meta--Attribute \
perl-MooseX--Getopt--Meta--Attribute--NoGetopt \
perl-MooseX--Getopt--Meta--Attribute--Trait \
perl-MooseX--Getopt--Meta--Attribute--Trait--NoGetopt \
perl-MooseX--Getopt--OptionTypeMap \
perl-MooseX--Getopt--ProcessedArgv \
perl-MooseX--Getopt--Strict \
perl-MooseX-Getopt"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Getopt--Long \
perl-Getopt--Long--Descriptive \
perl-Moose \
perl-Moose--Meta--Attribute \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints \
perl-MooseX--Role--Parameterized \
perl-Try--Tiny \
perl-namespace--autoclean"

inherit rpm
