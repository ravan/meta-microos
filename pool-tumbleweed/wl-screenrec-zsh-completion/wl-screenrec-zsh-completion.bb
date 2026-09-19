SUMMARY = "Zsh Completion for wl-screenrec"
DESCRIPTION = "Zsh command-line completion support for wl-screenrec."
LICENSE = "Apache-2.0"

PV = "0.2.0+git.20260517T151356.0925290"

RPM_NAME = "wl-screenrec-zsh-completion-0.2.0+git.20260517T151356.0925290-1.1.noarch.rpm"
RPM_HASH = "cff3a695093b8313b102cd444d2d0430e592045b8ac903d0f2c210e52d4d4af6c13b125f15ad10a7a8b7ecd864e646ee9f614030ed54769c82fa5547beb32fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-screenrec-zsh-completion"

RDEPENDS:${PN} += "wl-screenrec \
zsh"

inherit rpm
