SUMMARY = "Fish Completion for kubectl-retina"
DESCRIPTION = "Fish command line completion support for kubectl-retina."
LICENSE = "Apache-2.0"

PV = "0.0.16"

RPM_NAME = "kubectl-retina-fish-completion-0.0.16-1.13.noarch.rpm"
RPM_HASH = "f943cd4ca07b26991ba248bb7888e52accd8d8a0f49c0d9a8f4fd15dfeb792f4e2ebe070f25af42f8bc12fb0c5e34b6ffb787ef9a5c6b1309120ce2ed2f38b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-retina-fish-completion"

RDEPENDS:${PN} += "kubectl-retina"

inherit rpm
