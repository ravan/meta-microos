SUMMARY = "Set of version requirements for a CPAN dist"
DESCRIPTION = "A CPAN::Meta::Requirements object models a set of version constraints like \
those specified in the _META.yml_ or _META.json_ files in CPAN \
distributions, and as defined by CPAN::Meta::Spec. It can be built up by \
adding more and more constraints, and it will reduce them to the simplest \
representation. \
 \
Logically impossible constraints will be identified immediately by thrown \
exceptions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.145"

RPM_NAME = "perl-CPAN-Meta-Requirements-2.145-1.4.noarch.rpm"
RPM_HASH = "8ff118df10bc7e6b8047e6c0d3ad40a692675ed936beca1b2c68d91cf4f4cdd9afbf71062b1d298915daa3658823a3aae111510303c43e76943ab666255e12f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Meta--Requirements \
perl-CPAN--Meta--Requirements--Range \
perl-CPAN-Meta-Requirements"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-version"

inherit rpm
