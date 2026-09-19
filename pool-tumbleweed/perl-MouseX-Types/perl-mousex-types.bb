SUMMARY = "Organize your Mouse types in libraries"
DESCRIPTION = "Organize your Mouse types in libraries"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-MouseX-Types-0.06-11.36.noarch.rpm"
RPM_HASH = "186eeff78c0176054132d3d4271b9f9762af3962cba1523ef640e568086347d3968613b8d778e23fc8728cc6d513c35807eb70290ab3e820514aec2ea22c67d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--Types \
perl-MouseX--Types--Base \
perl-MouseX--Types--Moose \
perl-MouseX--Types--Mouse \
perl-MouseX--Types--TypeDecorator \
perl-MouseX-Types"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Any--Moose \
perl-Mouse"

inherit rpm
