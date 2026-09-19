SUMMARY = "Fish Completion for direnv"
DESCRIPTION = "Fish command-line completion support for direnv."
LICENSE = "MIT"

PV = "2.37.1"

RPM_NAME = "direnv-fish-completion-2.37.1-1.8.noarch.rpm"
RPM_HASH = "a56d5d1136ec6c76a3a6b9ebc5892c1f46e082c4354f37759d0cb3bc603787dec33d729459da5ad0f00ab813c0f043dd8eafbd187a639a0bac6fd40eb18735e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "direnv-fish-completion"

RDEPENDS:${PN} += "direnv \
fish"

inherit rpm
