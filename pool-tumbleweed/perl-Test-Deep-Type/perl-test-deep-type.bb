SUMMARY = "Test::Deep plugin for validating type constraints"
DESCRIPTION = "This is a Test::Deep plugin that provides the sub 'is_type' to indicate \
that the data being tested must validate against the passed type. This is \
an actual type _object_, not a string name -- for example something \
provided via MooseX::Types, or a plain old coderef that returns a bool \
(such as what might be used in a Moo type constraint)."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008"

RPM_NAME = "perl-Test-Deep-Type-0.008-1.38.noarch.rpm"
RPM_HASH = "780efc22b5ee1608df0337f57c199520290f21824eda6d917c75dc1c9fe0368d9e377fd2ec3b5da85684c1061365f2269fcf72f4b11c7544ad135c9bbe30142c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Deep--Type \
perl-Test-Deep-Type"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--Deep--Cmp \
perl-Try--Tiny \
perl-parent"

inherit rpm
