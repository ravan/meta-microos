SUMMARY = "Fish completion for khal"
DESCRIPTION = "Fish shell completions for khal"
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python-khal-fish-completion-0.14.1-1.1.noarch.rpm"
RPM_HASH = "699e561e3e533dc700d90e4f067ffecb7cc77a9656317e9da6bdbe817fff0aad6d05d7462cae22ed0d0a7d2fc416d3e95ee0dbf2ab2e5fd01b8b6bb9cb2a0b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-khal-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
