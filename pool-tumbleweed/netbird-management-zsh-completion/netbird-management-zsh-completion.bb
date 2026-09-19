SUMMARY = "Zsh Completion for netbird-management"
DESCRIPTION = "Zsh command line completion support for netbird-management."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-management-zsh-completion-0.78.1-1.1.noarch.rpm"
RPM_HASH = "a8a70c601be3324230f323896a02fb686e90e2fc911fd2357ae2d3c009f298b36f2221fe04748a0f22389ae9dbc87fa3225f2ab9e8555b26dfe318fcda11a09e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbird-management-zsh-completion"

RDEPENDS:${PN} += "netbird-management \
zsh"

inherit rpm
