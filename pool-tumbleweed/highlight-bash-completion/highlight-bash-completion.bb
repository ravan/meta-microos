SUMMARY = "Bash completion for highlight"
DESCRIPTION = "This package provides Bash command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.18"

RPM_NAME = "highlight-bash-completion-4.18-1.6.noarch.rpm"
RPM_HASH = "df310d9bc5103d56072f4eba95a514d9bf82334d7d121c930851af16950d282b468ecaea2fb1c3649bacd885ab7a6badc0dcf7f91f9272eb4d8e0d138c050620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-bash-completion"

RDEPENDS:${PN} += "bash-completion \
highlight"

inherit rpm
