SUMMARY = "Zsh Completion for kubeshark-cli"
DESCRIPTION = "zsh command line completion support for kubeshark-cli."
LICENSE = "Apache-2.0"

PV = "53.4.0"

RPM_NAME = "kubeshark-cli-zsh-completion-53.4.0-1.1.noarch.rpm"
RPM_HASH = "da84fd6df00d3b6f2ac91a2af79d514c038c0454991f95d9aab1e4db91733e1ba204af3a15eb6389cdbd182cb5b3842b0ad66b628b9b4a0f1b066de9cf39c070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeshark-cli-zsh-completion"

RDEPENDS:${PN} += "kubeshark-cli"

inherit rpm
