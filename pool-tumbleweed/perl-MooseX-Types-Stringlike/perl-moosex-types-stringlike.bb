SUMMARY = "Moose type constraints for strings or string-like objects"
DESCRIPTION = "This module provides a more general version of the 'Str' type. If coercions \
are enabled, it will accepts objects that overload stringification and \
coerces them into strings."
LICENSE = "Apache-2.0"

PV = "0.003"

RPM_NAME = "perl-MooseX-Types-Stringlike-0.003-3.41.noarch.rpm"
RPM_HASH = "ec19985ddb426caaca976648478a0fc6e210774a498433cf8fcbc3de4e41006823b3ab795fbb98db65fa07a796b5257a58b1ecccbd400ef68e4a0b5d2d629c3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Stringlike \
perl-MooseX-Types-Stringlike"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-MooseX--Types \
perl-MooseX--Types--Moose"

inherit rpm
