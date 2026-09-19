SUMMARY = "The Illicit Love Child of Moose and POE"
DESCRIPTION = "MooseX::POE is a the Moose manpage wrapper around a the POE::Session \
manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.215"

RPM_NAME = "perl-MooseX-POE-0.215-9.41.noarch.rpm"
RPM_HASH = "b862569530cc3c2eeaeee00556a4d753e4ac2e09c559a0312048c724eccaa54ca5f1fb61fd5da69fb602b3f5c1f49382226c2fba7edfeef76f06f656cdaaeae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--POE \
perl-MooseX--POE--Aliased \
perl-MooseX--POE--Meta--Method--State \
perl-MooseX--POE--Meta--Role \
perl-MooseX--POE--Meta--Trait \
perl-MooseX--POE--Meta--Trait--Class \
perl-MooseX--POE--Meta--Trait--Instance \
perl-MooseX--POE--Meta--Trait--Object \
perl-MooseX--POE--Meta--Trait--SweetArgs \
perl-MooseX--POE--Role \
perl-MooseX--POE--SweetArgs \
perl-MooseX-POE"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-POE"

inherit rpm
