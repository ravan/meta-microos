SUMMARY = "Refresh %INC files when updated on disk"
DESCRIPTION = "This module is a generalization of the functionality provided by \
Apache::StatINC and Apache::Reload. It's designed to make it easy to do \
simple iterative development when working in a persistent environment. \
 \
It does not require mod_perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.18"

RPM_NAME = "perl-Module-Refresh-0.18-1.20.noarch.rpm"
RPM_HASH = "cd3cdbe021968736e5e04847d005014ed5344a5c0d7e74be9e83851ac524e5643a25950bcf36e8fc46f48a70d93d69dee993e5ceeebdb396bcfa47782195f64c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Refresh \
perl-Module-Refresh"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
