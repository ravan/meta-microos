SUMMARY = "Python library for git-bug"
DESCRIPTION = "A standalone Python library for working with https://github.com/git-bug/git-bug \
repositories. It lets you list, create, query, and update bugs that are stored \
as native git objects -- no external database required."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "python313-ezgb-0.2.0-1.1.noarch.rpm"
RPM_HASH = "fd588cfe78a7675869ded876e8f8e28fe7f828d08abd149a5cdea1fdf33d6e19de1a7146a6bc7cc12f98b83d693e3dabde8b756061bd016d126a411fdf695ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ezgb \
python3.13dist-ezgb \
python313-ezgb \
python3dist-ezgb"

RDEPENDS:${PN} += "python-abi \
python313-pygit2"

inherit rpm
