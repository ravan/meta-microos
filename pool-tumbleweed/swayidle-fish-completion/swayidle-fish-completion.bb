SUMMARY = "Fish completion for swayidle"
DESCRIPTION = "Fish command line completion support for swayidle."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "swayidle-fish-completion-1.9.0-1.5.noarch.rpm"
RPM_HASH = "ef67f0637277bcb6f99c5d98fad4e53ea50afb2f865dbd1de641e77884ec2ad3ce83c23331c8c00f72fc4b1ff9c9435ecc7f336cf831395489456c66f9945a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swayidle-fish-completion"

RDEPENDS:${PN} += "swayidle"

inherit rpm
