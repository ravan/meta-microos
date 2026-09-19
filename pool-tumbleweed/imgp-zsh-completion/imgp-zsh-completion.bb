SUMMARY = "ZSH Completion for imgp"
DESCRIPTION = "ZSH command line completion support for imgp."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "imgp-zsh-completion-3.0-1.1.noarch.rpm"
RPM_HASH = "147efd8895af04a026e7fb883845e69667a12b5ecba61313340c4afd3f7076caea1938344ab1dfc1c5528d844a13e1f811836e05d269fe32b0af1952671ffc01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imgp-zsh-completion"

RDEPENDS:${PN} += "imgp"

inherit rpm
