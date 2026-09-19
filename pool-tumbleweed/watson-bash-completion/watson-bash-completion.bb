SUMMARY = "Bash completion for watson"
DESCRIPTION = "Bash command line completion support for watson."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "watson-bash-completion-2.1.0-1.15.noarch.rpm"
RPM_HASH = "ce96145eb2b1d0002cdf1a04c8bb46fa04cfa5186595aae47ac203abc48f76af3e480d447e054f17df446ad0ebca1af46089645fb74e673f96a4b8560a250e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "watson-bash-completion"

RDEPENDS:${PN} += "watson"

inherit rpm
