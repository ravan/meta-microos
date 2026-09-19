SUMMARY = "Set::Object type with coercions and stuff"
DESCRIPTION = "This module provides a Moose type constraint (see the \
Moose::Util::TypeConstraints manpage, the MooseX::Types manpage). Note that \
this constraint and its coercions are *global*, not simply limited to the \
scope that imported it -- in this way it acts like a regular the Moose \
manpage type constraint, rather than one from the MooseX::Types manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-MooseX-Types-Set-Object-0.05-1.39.noarch.rpm"
RPM_HASH = "7b04c361f4044ce4404838779e6d71ab4f8a36376aa0450f16fefca533a5ca7aac9c3a7a49c0788691a43294ecb2b5c4aac344d1e1d785423ba577fcd8ab846c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Set--Object \
perl-MooseX-Types-Set-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-Set--Object"

inherit rpm
