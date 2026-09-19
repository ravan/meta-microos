SUMMARY = "Fish completion for git-bug"
DESCRIPTION = "Fish shell completions for git-bug"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "git-bug-fish-completion-0.10.1-7.1.noarch.rpm"
RPM_HASH = "50aec7e0345a149dbae90178da6b57078d196fcfaa2fc7a4f60f7a218ff291387c283b49835a0e97b333dfb891a6208365e5c4fb89b2a9d5c494877d1d2939e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-bug-fish-completion"

RDEPENDS:${PN} += "fish \
git-bug"

inherit rpm
