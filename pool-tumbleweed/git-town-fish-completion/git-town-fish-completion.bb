SUMMARY = "Fish Completion for git-town"
DESCRIPTION = "Fish command line completion support for git-town."
LICENSE = "MIT"

PV = "24.0.0"

RPM_NAME = "git-town-fish-completion-24.0.0-1.2.noarch.rpm"
RPM_HASH = "518872c86fc8ca78ce7a55035be17d6ffb85164bc69a4b094ff22949e178eefa9374171ae988e3e43581833e61006e9f8fea3d5436977eb266ca1808d848f038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-town-fish-completion"

RDEPENDS:${PN} += "fish \
git-town"

inherit rpm
