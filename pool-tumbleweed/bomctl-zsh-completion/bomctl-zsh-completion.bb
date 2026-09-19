SUMMARY = "Zsh Completion for bomctl"
DESCRIPTION = "zsh command line completion support for bomctl."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "bomctl-zsh-completion-0.4.3-1.8.noarch.rpm"
RPM_HASH = "2bdc80c522fb5cbb74aa67714b68210b92aefd3955ca5837447c512a006fa454bb0ccd2ec7ce6dd2b29418369564a8cdaecabef00112d0b6409b5990243f373c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bomctl-zsh-completion"

RDEPENDS:${PN} += "bomctl"

inherit rpm
