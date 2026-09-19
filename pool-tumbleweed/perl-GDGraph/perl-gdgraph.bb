SUMMARY = "Produces charts with GD"
DESCRIPTION = "Produces charts with GD"
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & GPL-2.0-or-later"

PV = "1.560.0"

RPM_NAME = "perl-GDGraph-1.560.0-1.12.noarch.rpm"
RPM_HASH = "0b1ba59d9ec07c49d3b9940f923caab2d36d18dcad3740b1ea1f3d3395741deacf6b9e76b29a3068fbcbbd7f4b98344ee59c88b32be7fc98a89b103f41c39298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GD--Graph \
perl-GDGraph"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-GD \
perl-GD--Text"

inherit rpm
