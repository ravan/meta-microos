SUMMARY = "Fish Completion for roast"
DESCRIPTION = "Fish command-line completion support for roast."
LICENSE = "MPL-2.0"

PV = "10.0.2"

RPM_NAME = "roast-fish-completion-10.0.2-1.11.noarch.rpm"
RPM_HASH = "6d89811e43fb95ec4c3293f7e31da0c4d19551f01f13486322fb80549d7514d08c4f520e2578f93b8ddafbc118d384eba9d4534989b6d451d4f02addb7f92642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "roast-fish-completion"

RDEPENDS:${PN} += "fish \
roast"

inherit rpm
