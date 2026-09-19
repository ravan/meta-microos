SUMMARY = "Fish Completion for gum"
DESCRIPTION = "Fish command-line completion support for gum."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "gum-fish-completion-0.16.0-1.8.noarch.rpm"
RPM_HASH = "6e33ce0f580623a279a781a4f8e124cfb15df9b1a6b9c5a1c6cd3fadfe7bc4823367bafee1b10b59c4fb4707dfde5e5216c5f3b806d33f9372f51cd290e12585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gum-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
