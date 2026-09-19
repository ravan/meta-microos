SUMMARY = "Fish Completion for lf"
DESCRIPTION = "Fish command-line completion support for lf."
LICENSE = "MIT"

PV = "34"

RPM_NAME = "lf-fish-completion-34-1.10.noarch.rpm"
RPM_HASH = "15b5aabb890491d8ba560d17ea306c1b1601cc7e709e7e927bd668c07ebbf7c66474fe80e9fc0bc3136afd125cf82c81772d2d404de37097505ded9bf7e2293e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lf-fish-completion"

RDEPENDS:${PN} += "fish \
lf"

inherit rpm
