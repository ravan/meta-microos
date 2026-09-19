SUMMARY = "OneDrive fish completion"
DESCRIPTION = "OneDrive shell completions for fish."
LICENSE = "GPL-3.0-only"

PV = "2.5.11"

RPM_NAME = "onedrive-completion-fish-2.5.11-1.4.noarch.rpm"
RPM_HASH = "d1b6a67920aa4522d9f01ca036c8edb1f728a8bd0464bf75cbe61d3b2c724486e0abcc2acfecb60a6fc05fe2454260bfe21a16c336404527bed1b6062a9b0810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "onedrive-completion-fish"

RDEPENDS:${PN} += "fish \
onedrive"

inherit rpm
