SUMMARY = "Fish Completion for nono-cli"
DESCRIPTION = "Fish command line completion support for nono-cli."
LICENSE = "Apache-2.0"

PV = "0.77.0"

RPM_NAME = "nono-cli-fish-completion-0.77.0-1.1.noarch.rpm"
RPM_HASH = "cd1ea779c5fc0b5b47d36a83b132e85bb5223b4c5a80dccbacc75a6b2a367ebce34b9e105aa3848d75dcf0973f79fae54c644112b13377d4b8db78607f09b147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nono-cli-fish-completion"

RDEPENDS:${PN} += "nono-cli"

inherit rpm
