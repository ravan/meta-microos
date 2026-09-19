SUMMARY = "Efficient generation of subroutines via string eval"
DESCRIPTION = "This package provides performant ways to generate subroutines from strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.006009"

RPM_NAME = "perl-Sub-Quote-2.006009-1.5.noarch.rpm"
RPM_HASH = "2541e96cc0aa0e2c7d5c59a676c2081d7bd36f4b714ee68ac6ccb2eb97d6ab0d524f7a23c82d3e489f98042ba72585dd4c4ea994c347ad928a4c34a5c2d037ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Defer \
perl-Sub--Quote \
perl-Sub-Quote"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
