SUMMARY = "Fish Completion for pijul"
DESCRIPTION = "Fish command-line completion support for pijul."
LICENSE = "GPL-2.0-only"

PV = "1.0.0~beta.9"

RPM_NAME = "pijul-fish-completion-1.0.0~beta.9-1.12.noarch.rpm"
RPM_HASH = "0b332d53bc0f9b921c9fbbcba4c34ca02f6c99f3b3137c58a713bdb07d388cd92c8ae66ab376e73047f8eee0d5778be0c70b0219accb09984566165e714b0bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pijul-fish-completion"

RDEPENDS:${PN} += "fish \
pijul"

inherit rpm
