SUMMARY = "Fish Completion for fastfetch"
DESCRIPTION = "Fish command-line completion support for fastfetch."
LICENSE = "MIT"

PV = "2.68.1"

RPM_NAME = "fastfetch-fish-completion-2.68.1-1.1.noarch.rpm"
RPM_HASH = "5fd324865a5b6b1691b96ac4458f6d723c1c2dc5c2ce9c61e899162602ec47f1e29e67b60b3dca319567014f5291fb255dc56a986a467fd3fd69cc79ea7183aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fastfetch-fish-completion"

RDEPENDS:${PN} += "fastfetch \
fish"

inherit rpm
