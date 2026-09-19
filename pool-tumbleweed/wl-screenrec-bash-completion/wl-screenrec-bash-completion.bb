SUMMARY = "Bash Completion for wl-screenrec"
DESCRIPTION = "Bash command-line completion support for wl-screenrec."
LICENSE = "Apache-2.0"

PV = "0.2.0+git.20260517T151356.0925290"

RPM_NAME = "wl-screenrec-bash-completion-0.2.0+git.20260517T151356.0925290-1.1.noarch.rpm"
RPM_HASH = "1b3c479a4c943e409c5b8466340422d64b7aab77c12bc6df7df539aa8d912c5f1bcd21b63545d391bdfb3f6787e172109a887511cd505f2d56741a86d551964f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-screenrec-bash-completion"

RDEPENDS:${PN} += "bash-completion \
wl-screenrec"

inherit rpm
