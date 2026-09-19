SUMMARY = "Fish Completion for nfpm"
DESCRIPTION = "Fish command line completion support for nfpm."
LICENSE = "MIT"

PV = "2.47.0"

RPM_NAME = "nfpm-fish-completion-2.47.0-1.3.noarch.rpm"
RPM_HASH = "9f930d1b50e9b5547547ee310034dfd434520e7aa1032e54b508375c58c01beda73c7f93a0b13fb4954dc36cea16c2e80302524fa538ad914f48c32745845778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nfpm-fish-completion"

RDEPENDS:${PN} += "nfpm"

inherit rpm
