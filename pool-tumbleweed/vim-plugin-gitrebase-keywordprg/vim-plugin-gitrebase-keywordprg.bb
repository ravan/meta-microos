SUMMARY = "Set keywordprg in git rebase --interactive"
DESCRIPTION = "Set keywordprg in git rebase --interactive. This used to done before vim \
8.2.4529, but was changed afterwards. For details, see \
https://github.com/vim/vim/issues/9845."
LICENSE = "GPL-2.0-only"

PV = "1"

RPM_NAME = "vim-plugin-gitrebase-keywordprg-1-64.2.noarch.rpm"
RPM_HASH = "4b8b76b0bc6f0f7394c93f069739cc2fda5efdc9df1ceb8bf4b16acebae84bb490fc28d4c36d85b2f688a0de7dcdd95d3f4d7eabb6fd279667573e55f98abc4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-gitrebase-keywordprg"

RDEPENDS:${PN} += "git-core"

inherit rpm
