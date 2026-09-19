SUMMARY = "Fish Completion for typst"
DESCRIPTION = "Fish command-line completion support for typst."
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "typst-fish-completion-0.15.1-1.1.noarch.rpm"
RPM_HASH = "e8cc4a5eb841486e127e5e7872c22ba8340328686ccb7c2347d17c8b9d414750dcb83f3679bde5597001a0ffeaae7ae67903505221da675d2a5fab6a1b58849b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typst-fish-completion"

RDEPENDS:${PN} += "typst"

inherit rpm
