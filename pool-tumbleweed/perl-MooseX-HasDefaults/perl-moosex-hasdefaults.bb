SUMMARY = "Default 'Is' to 'Ro' or 'Rw' for All Attributes"
DESCRIPTION = "The module MooseX::HasDefaults::RO defaults 'is' to 'ro'. \
 \
The module MooseX::HasDefaults::RW defaults 'is' to 'rw'. \
 \
If you pass a specific value to any 'has''s 'is', that overrides the \
default. If you do not want an accessor, pass 'is => undef'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-MooseX-HasDefaults-0.03-2.35.noarch.rpm"
RPM_HASH = "6af6445649f407d39999dd5c9c0ed836d6dbe43d330e606aedef8db7f53a39de207b61619210d9c76f33eda8e1867ce6069d0a75f3f414e6512ea62d0141b399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--HasDefaults \
perl-MooseX--HasDefaults--Meta--IsRO \
perl-MooseX--HasDefaults--Meta--IsRW \
perl-MooseX--HasDefaults--RO \
perl-MooseX--HasDefaults--RW \
perl-MooseX-HasDefaults"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose"

inherit rpm
