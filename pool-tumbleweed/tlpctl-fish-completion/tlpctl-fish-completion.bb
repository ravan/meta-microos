SUMMARY = "Fish Completion for tlpctl"
DESCRIPTION = "The official fish completion script for tlpctl."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.10.2"

RPM_NAME = "tlpctl-fish-completion-1.10.2-1.1.noarch.rpm"
RPM_HASH = "faa9ee6a8a0ddeb2eda37b22f6c93fbc72a17501543524ddf3543ef751aa008669ddfb6222ca22b80f696a2d7c759207356bca42f968d8b1592070175bc447e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlpctl-fish-completion"

RDEPENDS:${PN} += "tlp-pd"

inherit rpm
