SUMMARY = "Bash completions for yadm"
DESCRIPTION = "The official bash completion script for yadm."
LICENSE = "GPL-3.0-only"

PV = "3.3.0"

RPM_NAME = "yadm-bash-completion-3.3.0-1.6.noarch.rpm"
RPM_HASH = "5afc60d04b4007b9ef6d1be5d1e64e8a1232841f627cb5dccbd528c4d3df2ddb3aacfc4358345fd99e5a5565f9e20d6971fcb51340885cba534154f4e31472b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yadm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
