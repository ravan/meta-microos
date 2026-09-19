SUMMARY = "Fish Completion for forgejo-runner"
DESCRIPTION = "Fish command line completion support for forgejo-runner."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.0"

RPM_NAME = "forgejo-runner-fish-completion-13.1.0-1.1.noarch.rpm"
RPM_HASH = "41fb1b556e2ce70ffad50cb1774e2526419f78370be19c8e327aa7677790177c9dfdde05737c556c78e7106c2c0d8081fe293de5d4d0e2959544085afb9e3d25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forgejo-runner-fish-completion"

RDEPENDS:${PN} += "forgejo-runner"

inherit rpm
