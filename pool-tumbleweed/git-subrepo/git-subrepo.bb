SUMMARY = "Git Submodule Alternative"
DESCRIPTION = "This git command 'clones' an external git repo into a subdirectory of your \
repo. Later on, upstream changes can be pulled in, and local changes can be \
pushed back. Simple."
LICENSE = "MIT"

PV = "0.4.9"

RPM_NAME = "git-subrepo-0.4.9-1.1.noarch.rpm"
RPM_HASH = "19d898d441e4e9570ae1f5e5639268b8823c0f241934810df2f63b4b6a1dc785d28050755285b066ede3959e83d90c0986ded1a815da27388560a34372319a19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-subrepo"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
git-core"

inherit rpm
