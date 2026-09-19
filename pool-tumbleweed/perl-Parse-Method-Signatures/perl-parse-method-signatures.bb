SUMMARY = "Perl6 like method signature parser"
DESCRIPTION = "Inspired by Perl6::Signature but streamlined to just support the subset \
deemed useful for TryCatch and MooseX::Method::Signatures."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.003019"

RPM_NAME = "perl-Parse-Method-Signatures-1.003019-1.38.noarch.rpm"
RPM_HASH = "4ee930236d192a30187990347586819bfc078b035b4e1620c88fe1f3cfa2f3d15a89b60c46edafbaa8c36fc06ad62efc6f6d6b200736442d73599e23a78fb2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--Method--Signatures \
perl-Parse--Method--Signatures--Param \
perl-Parse--Method--Signatures--Param--Bindable \
perl-Parse--Method--Signatures--Param--Named \
perl-Parse--Method--Signatures--Param--Placeholder \
perl-Parse--Method--Signatures--Param--Positional \
perl-Parse--Method--Signatures--Param--Unpacked \
perl-Parse--Method--Signatures--Param--Unpacked--Array \
perl-Parse--Method--Signatures--Param--Unpacked--Hash \
perl-Parse--Method--Signatures--ParamCollection \
perl-Parse--Method--Signatures--Sig \
perl-Parse--Method--Signatures--TypeConstraint \
perl-Parse--Method--Signatures--Types \
perl-Parse-Method-Signatures"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Load \
perl-List--MoreUtils \
perl-Moose \
perl-MooseX--Traits \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-MooseX--Types--Structured \
perl-PPI \
perl-namespace--clean"

inherit rpm
