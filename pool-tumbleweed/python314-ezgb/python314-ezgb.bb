SUMMARY = "Python library for git-bug"
DESCRIPTION = "A standalone Python library for working with https://github.com/git-bug/git-bug \
repositories. It lets you list, create, query, and update bugs that are stored \
as native git objects -- no external database required."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "python314-ezgb-0.2.0-1.1.noarch.rpm"
RPM_HASH = "caabc042be81615277f47230c4e4f9138e927b5ec1a85383092952b97eb581b6c6a9e0e7b640613dc969ce208e1b231df3042137ce7c02cd9834d35241116fd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ezgb \
python314-ezgb \
python3dist-ezgb"

RDEPENDS:${PN} += "python-abi \
python314-pygit2"

inherit rpm
