SUMMARY = "Structured Type Constraints for Moose"
DESCRIPTION = "A structured type constraint is a standard container Moose type constraint, \
such as an 'ArrayRef' or 'HashRef', which has been enhanced to allow you to \
explicitly name all the allowed type constraints inside the structure. The \
generalized form is: \
 \
    TypeConstraint[@TypeParameters or %TypeParameters] \
 \
Where 'TypeParameters' is an array reference or hash references of \
Moose::Meta::TypeConstraint objects. \
 \
This type library enables structured type constraints. It is built on top \
of the MooseX::Types library system, so you should review the documentation \
for that if you are not familiar with it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.36"

RPM_NAME = "perl-MooseX-Types-Structured-0.36-1.36.noarch.rpm"
RPM_HASH = "ffd0f6a7f17ce84baeb5e3b6658eb24dc57674084473d68bf372742d26e7572eb2bd719d60190ae0096eaf5b26345a958dc589a78e9b2501f10ee795d0bb3c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Structured \
perl-MooseX-Types-Structured"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--PartialDump \
perl-Moose \
perl-Moose--Meta--TypeCoercion \
perl-Moose--Meta--TypeConstraint \
perl-Moose--Meta--TypeConstraint--Parameterizable \
perl-Moose--Util--TypeConstraints \
perl-MooseX--Types \
perl-Sub--Exporter \
perl-namespace--clean"

inherit rpm
