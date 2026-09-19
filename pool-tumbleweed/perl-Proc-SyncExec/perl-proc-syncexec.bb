SUMMARY = "Spawn processes but report exec() errors"
DESCRIPTION = "This module contains functions for synchronized process spawning with full \
error return. If the child's exec() call fails the reason for the failure \
is reported back to the parent."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Proc-SyncExec-1.01-1.27.noarch.rpm"
RPM_HASH = "637cb23d671fce121094e5c33bca9173295d90368f579d2355dad478673c2b89c98015dd6738a8cb73c3ee42a136c7716248e15687eded2fe1f38aee0930ffa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Proc--SyncExec \
perl-Proc-SyncExec"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
