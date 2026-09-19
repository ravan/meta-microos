SUMMARY = "Fish completion for pnpm"
DESCRIPTION = "Fish command line completion support for pnpm."
LICENSE = "MIT"

PV = "11.9.0"

RPM_NAME = "pnpm-fish-completion-11.9.0-1.1.noarch.rpm"
RPM_HASH = "b0a644cf1d1e6c204884d9225d66845f7ad082656dde398ad84f23af57f5ddf8de09bc0c322ac9ac9768b7b02d7d08b3221bb18e6b70d7e8c3a00df43435dab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnpm-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
