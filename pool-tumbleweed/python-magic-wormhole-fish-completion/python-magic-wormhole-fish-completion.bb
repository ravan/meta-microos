SUMMARY = "Fish Completion for python-magic-wormhole"
DESCRIPTION = "Fish command-line completion support for python-magic-wormhole."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "python-magic-wormhole-fish-completion-0.24.0-2.1.noarch.rpm"
RPM_HASH = "b7f4b5420ba8e22f47034bb6e1687525f1cb23203792e6f6be7de106cfcbe397d7c65cfd5993e33694a73d3eef299ff53428e1c279f7d997f829d50f405279e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-magic-wormhole-fish-completion"

RDEPENDS:${PN} += "fish \
python3dist-magic-wormhole"

inherit rpm
