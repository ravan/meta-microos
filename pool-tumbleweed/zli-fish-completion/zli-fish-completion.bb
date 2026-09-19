SUMMARY = "Fish Completion for zli"
DESCRIPTION = "Fish command line completion support for zli."
LICENSE = "Apache-2.0"

PV = "2.1.20"

RPM_NAME = "zli-fish-completion-2.1.20-1.2.noarch.rpm"
RPM_HASH = "8dfbdd7c02dad56acb281fe3ef7af35039df31ba1178d0a261d57468064ddbb289e299e39078445632207c9a29c4b4188cd34873950d0569fae9849a73bbb536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zli-fish-completion"

RDEPENDS:${PN} += "fish \
zli"

inherit rpm
