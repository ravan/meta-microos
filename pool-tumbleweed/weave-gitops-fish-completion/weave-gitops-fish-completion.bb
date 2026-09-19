SUMMARY = "Fish Completion for weave-gitops"
DESCRIPTION = "Fish command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.38.0"

RPM_NAME = "weave-gitops-fish-completion-0.38.0-1.16.noarch.rpm"
RPM_HASH = "0c1ec02176df5741956aea2413decbe5a8c639959cb25a5456bf19a252195e2299fbce81afb9956c153741a4dcd39fcef890339801dae438de1b7637f296c403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-fish-completion"

RDEPENDS:${PN} += "weave-gitops"

inherit rpm
