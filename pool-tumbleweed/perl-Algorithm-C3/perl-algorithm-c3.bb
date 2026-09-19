SUMMARY = "Module for merging hierarchies using the C3 algorithm"
DESCRIPTION = "This module implements the C3 algorithm. I have broken this out into it's \
own module because I found myself copying and pasting it way too often for \
various needs. Most of the uses I have for C3 revolve around class building \
and metamodels, but it could also be used for things like dependency \
resolution as well since it tends to do such a nice job of preserving local \
precedence orderings. \
 \
Below is a brief explanation of C3 taken from the Class::C3 module. For \
more detailed information, see the SEE ALSO section and the links there."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.110.0"

RPM_NAME = "perl-Algorithm-C3-0.110.0-1.10.noarch.rpm"
RPM_HASH = "1c70167168161f26499960b89622cf8e42c1c3b6ad0efc4a6f3a6094c94545e79d5f3b7029a802aeb508ca8dc9f36da941d3c199fe27834384039b572489c092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Algorithm--C3 \
perl-Algorithm-C3"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
