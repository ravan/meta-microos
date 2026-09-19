SUMMARY = "Minimalistic variant of Class::Accessor"
DESCRIPTION = "The module is a variant of 'Class::Accessor'. It is fast and requires less \
typing, has no dependencies to other modules, and does not mess up the \
@ISA."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.80.0"

RPM_NAME = "perl-Class-Accessor-Lite-0.80.0-1.3.noarch.rpm"
RPM_HASH = "a52fb0b3eeecc79e03364c0a8baf7cc541461a62252caa505df77bde9905e3abe2f60156bb32fd4d01174f44291895ea2f40c920e6ff07e54874a53802fc3e86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Accessor--Lite \
perl-Class-Accessor-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
