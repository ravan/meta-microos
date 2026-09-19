SUMMARY = "Fish completion for you-get"
DESCRIPTION = "Fish command line completion support for you-get."
LICENSE = "MIT"

PV = "0.4.1743"

RPM_NAME = "you-get-fish-completion-0.4.1743-3.1.noarch.rpm"
RPM_HASH = "f53993167bac39de020dd40a33c3bf5028ba05c00894e458fb590ddcbea688906fa036881a5f8e6f3386a820721c5ad9ac1d2783858448aeaef53fdee18b4d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "you-get-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
