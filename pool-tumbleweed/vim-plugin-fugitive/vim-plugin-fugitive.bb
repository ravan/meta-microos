SUMMARY = "Fugitive plugin for Vim"
DESCRIPTION = "Provides git integration with vim."
LICENSE = "Vim"

PV = "3.7"

RPM_NAME = "vim-plugin-fugitive-3.7-64.2.noarch.rpm"
RPM_HASH = "1ed729be2d4fdbbb11579c947dd242abfc31f63658a720cf3a45878fc7b09f92d52c48ab52aea1d46191d273a8b4cdee84a65cbb9f5a3ab09d5f71818e227816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-fugitive"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core"

inherit rpm
