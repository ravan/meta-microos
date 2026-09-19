SUMMARY = "Fish Completion for gcrane"
DESCRIPTION = "Fish command line completion support for gcrane."
LICENSE = "Apache-2.0"

PV = "0.22.1"

RPM_NAME = "gcrane-fish-completion-0.22.1-1.1.noarch.rpm"
RPM_HASH = "3cd21455637a5f240500e71285604bd9bb6c4b41339978e361cca27682bbb57677e8eaf42f00554c6e595b71aedc6cbb282a01fb742ee12055b8e8c9aa8d5ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcrane-fish-completion"

RDEPENDS:${PN} += "gcrane"

inherit rpm
