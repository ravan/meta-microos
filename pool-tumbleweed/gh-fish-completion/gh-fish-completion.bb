SUMMARY = "Fish completion for gh"
DESCRIPTION = "Fish command line completion support for gh."
LICENSE = "MIT"

PV = "2.100.0"

RPM_NAME = "gh-fish-completion-2.100.0-1.1.noarch.rpm"
RPM_HASH = "920de6f48c750469b3f22de9ce27db5a650a1d1c9510b6e6f6e28c7bf4003379b92184d51c086e7bb82867f43fa619c9c290795e6ea9faceba9ae0f81b9f7411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-fish-completion"

RDEPENDS:${PN} += "gh"

inherit rpm
