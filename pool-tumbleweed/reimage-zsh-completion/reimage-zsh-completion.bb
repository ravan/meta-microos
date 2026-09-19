SUMMARY = "Zsh Completion for reimage"
DESCRIPTION = "zsh command line completion support for reimage."
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "reimage-zsh-completion-0.15.1-1.2.noarch.rpm"
RPM_HASH = "1500f134ec8b0845cd9a563de629f1ef8e3f4c235ffe36438152c64a8c4190945506c66d2b2a57817556ac157be3875995cab4d3b3110c630ba05a846d4f1635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reimage-zsh-completion"

RDEPENDS:${PN} += "reimage"

inherit rpm
