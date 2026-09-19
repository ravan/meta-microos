SUMMARY = "Zsh Completion for duperemove"
DESCRIPTION = "ZSH command line completion support for duperemove."
LICENSE = "GPL-2.0-only"

PV = "0.15"

RPM_NAME = "duperemove-zsh-completion-0.15-1.7.noarch.rpm"
RPM_HASH = "8fc7d3c3ada0e88bdcf8769221dc84dc4b5fcfba95d37478828c32a1aa8f886710b2a594f013152be7e9ab72df5b73da12165785a835d6b747e6fdbdc9a68b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "duperemove-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
