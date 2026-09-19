SUMMARY = "Zsh Completion for longhornctl"
DESCRIPTION = "zsh command line completion support for longhornctl."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "longhornctl-zsh-completion-1.10.0-1.8.noarch.rpm"
RPM_HASH = "2e4d64deb8911fca7e4f4128bec2af72d8945ce022cc35184f17ae6e1be84e1020277ca721bc8af2144fb2cc5b9f13e47afb1884c293f7ad14897b02f6938f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "longhornctl-zsh-completion"

RDEPENDS:${PN} += "longhornctl"

inherit rpm
