SUMMARY = "Install subroutines into packages easily"
DESCRIPTION = "This module makes it easy to install subroutines into packages without the \
unsightly mess of 'no strict' or typeglobs lying about where just anyone \
can see them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.929"

RPM_NAME = "perl-Sub-Install-0.929-1.18.noarch.rpm"
RPM_HASH = "082498da9c68b20adf03c870932ca4a44158a4e559b9c994bfc2715ca8b4fc0eff50990fed25b2e2f7cc5b94726537e0d28b6a238a2a13150446dd4e0ba5ad66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Install \
perl-Sub-Install"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
