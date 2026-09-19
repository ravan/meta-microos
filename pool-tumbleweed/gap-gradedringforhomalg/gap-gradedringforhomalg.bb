SUMMARY = "GAP: Endow Commutative Rings with an Abelian Grading"
DESCRIPTION = "This package is part of the homalg-project and manages graded rings."
LICENSE = "GPL-2.0-only"

PV = "2026.04.01"

RPM_NAME = "gap-gradedringforhomalg-2026.04.01-1.2.noarch.rpm"
RPM_HASH = "cdf1755c5fcb46ff1f646c945d2cc0ea6739e3ca7c11dd53cd43ac26d2ce7f770230fa61eba29b0ae6ead4e23b86ffe23e351f4dda33e5fcf5276d5ae9089b3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-gradedringforhomalg"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-homalg \
gap-homalgtocas \
gap-matricesforhomalg \
gap-modules \
gap-ringsforhomalg"

inherit rpm
