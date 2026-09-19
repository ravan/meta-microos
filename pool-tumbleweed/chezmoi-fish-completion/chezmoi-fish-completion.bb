SUMMARY = "Fish completion for chezmoi"
DESCRIPTION = "Fish command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.72.1"

RPM_NAME = "chezmoi-fish-completion-2.72.1-1.1.noarch.rpm"
RPM_HASH = "d14fa3141b2d77cda232335823baf43e104911c3d6f86601bb7e3e355d046b4bfa2c33f7d60dc062dddc57c7757acd63c8d3c6c6169ba78682b573874812dbba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-fish-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
