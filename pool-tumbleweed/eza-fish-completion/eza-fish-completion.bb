SUMMARY = "Fish completion for eza"
DESCRIPTION = "Fish command line completion support for eza."
LICENSE = "EUPL-1.2"

PV = "0.23.5"

RPM_NAME = "eza-fish-completion-0.23.5-1.3.noarch.rpm"
RPM_HASH = "c474a069895c43ede3cc9ccf7a7098a26a46c546d49393f99ccce0aaec553249a6c2d8360224a880618814cd29090341a8c01d01273a185fb91c929414f2c671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eza-fish-completion"

RDEPENDS:${PN} += "eza"

inherit rpm
