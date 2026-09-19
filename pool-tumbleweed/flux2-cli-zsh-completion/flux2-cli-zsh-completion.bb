SUMMARY = "Zsh Completion for flux2-cli"
DESCRIPTION = "zsh command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.9.4"

RPM_NAME = "flux2-cli-zsh-completion-2.9.4-1.1.noarch.rpm"
RPM_HASH = "5265547f472a04b4122268ee166b574889866b69f75285f0d242d3e7259a1743751733285a084dcd5d57962b9b35cb6be67037c8adc605829907decffab43667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-zsh-completion"

RDEPENDS:${PN} += "flux2-cli"

inherit rpm
