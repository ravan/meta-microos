SUMMARY = "Detect perl's global phase on older perls"
DESCRIPTION = "This gives access to ${^GLOBAL_PHASE} in versions of perl that don't \
provide it. The built in variable will be used if it is available. \
 \
If all that is needed is detecting global destruction, \
Devel::GlobalDestruction should be used instead of this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003003"

RPM_NAME = "perl-Devel-GlobalPhase-0.003003-1.32.noarch.rpm"
RPM_HASH = "c1afc8444813c228983118b60dd644915655e139259e2773529fad7a47dec06145a55125683b1e7c3d8014186ce7cba7fc94fac19a45c2e1d824a0d46e31a4dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--GlobalPhase \
perl-Devel-GlobalPhase"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
