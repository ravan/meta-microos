SUMMARY = "ClassName type constraint with coercion to load the class"
DESCRIPTION = "    use Moose::Util::TypeConstraints; \
 \
    my $tc = subtype as ClassName; \
    coerce $tc, from Str, via { Class::Load::load_class($_); $_ }; \
 \
I've written those three lines of code quite a lot of times, in quite a lot \
of places. \
 \
Now I don't have to."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16.0"

RPM_NAME = "perl-MooseX-Types-LoadableClass-0.16.0-1.7.noarch.rpm"
RPM_HASH = "5a6bae2b295e5d21943d7009f66f7b6140c45d1a31946eeac5b9433c874ba9dfdfeb823dea381862c98b415f1def17683d0177841c937f7bb2fc32c5735ee230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--LoadableClass \
perl-MooseX-Types-LoadableClass"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Module--Runtime \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-namespace--autoclean"

inherit rpm
