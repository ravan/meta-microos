SUMMARY = "(DEPRECATED) Roles which support overloading"
DESCRIPTION = "MooseX::Role::WithOverloading allows you to write a the Moose::Role manpage \
which defines overloaded operators and allows those overload methods to be \
composed into the classes/roles/instances it's compiled to, where plain the \
Moose::Role manpages would lose the overloading. \
 \
Starting with the Moose manpage version 2.1300, this module is no longer \
necessary, as the functionality is available already. In that case, 'use \
MooseX::Role::WithOverloading' behaves identically to 'use Moose::Role'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-MooseX-Role-WithOverloading-0.17-1.51.aarch64.rpm"
RPM_HASH = "2e9a6920aa810c423e7c623e652f70dfb58e3ac1be94f305dfe561aadc456315da46c8676b7ba0a28d87d740fba9ad40b8668858d6dceaa6c720f80d2407d922"

RPROVIDES:${PN} += "perl-MooseX--Role--WithOverloading \
perl-MooseX--Role--WithOverloading--Meta--Role \
perl-MooseX--Role--WithOverloading--Meta--Role--Application \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--Composite \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--Composite--ToClass \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--Composite--ToInstance \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--Composite--ToRole \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--FixOverloadedRefs \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--ToClass \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--ToInstance \
perl-MooseX--Role--WithOverloading--Meta--Role--Application--ToRole \
perl-MooseX--Role--WithOverloading--Meta--Role--Composite \
perl-MooseX-Role-WithOverloading"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-aliased \
perl-namespace--autoclean \
perl-namespace--clean"

inherit rpm
