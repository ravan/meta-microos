SUMMARY = "Zsh Completion for sd"
DESCRIPTION = "Zsh command-line completion support for sd."
LICENSE = "(Apache-2.0 | MIT) & (MIT | Unlicense) & BSD-3-Clause & MIT & (MIT | Unlicense)"

PV = "1.1.0"

RPM_NAME = "sd-zsh-completion-1.1.0-1.4.noarch.rpm"
RPM_HASH = "6cbc96c0d94d010aab38410db634b5de602ec5347411336c9d4647262e12fa169d400296baca297f2be2f7d97929154d117d67b93b10a8ff47779370145ac9e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sd-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
