SUMMARY = "Optimized type checks for Moo + Type::Tiny"
DESCRIPTION = "This module optimizes Moo type checks when used with Type::Tiny to perform \
better. It will automatically apply to isa checks and coercions that use \
Type::Tiny. Non-Type::Tiny isa checks will work as normal. \
 \
This is done by inlining the type check in a more optimal manner that is \
specific to Type::Tiny rather than the general mechanism Moo usually uses. \
 \
With this module, setters with type checks should be as fast as an \
equivalent check in Moose. \
 \
It is hoped that eventually this type inlining will be done automatically, \
making this module unnecessary."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.2.3"

RPM_NAME = "perl-MooX-TypeTiny-0.2.3-1.3.noarch.rpm"
RPM_HASH = "57bcb795c199aa923475ba0a6ed78b44886a2b9f4f15ac97c932f886bc709653c327e72213dff87b0f52b76023c800068497bb52bcf396ec3d432432418eccdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--TypeTiny \
perl-MooX--TypeTiny--Role--GenerateAccessor \
perl-MooX-TypeTiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moo \
perl-Type--Tiny"

inherit rpm
