SUMMARY = "GAP: A Package for Localization of Polynomial Rings"
DESCRIPTION = "This package is part of the homalg project and allows localization of \
a (computable) commutative ring at a (finitely generated) maximal \
ideal."
LICENSE = "GPL-2.0-only"

PV = "2026.05.01"

RPM_NAME = "gap-localizeringforhomalg-2026.05.01-1.2.noarch.rpm"
RPM_HASH = "31235c7180cb48dfeebf0f2f2e665362f07726ee6bb9e3828462e96b5a39cfd186a417813f644ab2ab452f81ed15932a236d4254743cc7b022c6621a7162d37c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-localizeringforhomalg"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-homalgtocas \
gap-matricesforhomalg \
gap-modules"

inherit rpm
