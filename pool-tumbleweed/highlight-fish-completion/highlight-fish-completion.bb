SUMMARY = "Fish completion for highlight"
DESCRIPTION = "This package provides Fish command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.18"

RPM_NAME = "highlight-fish-completion-4.18-1.6.noarch.rpm"
RPM_HASH = "37bd949f93227f302edc95ba0f0640ebe10a2217baad8484133e4ac333cd06eabfa22b30c8909cd16789fd6686928ad83ea6c9ebb239bfd5fc35cefc0a521c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-fish-completion"

RDEPENDS:${PN} += "fish \
highlight"

inherit rpm
