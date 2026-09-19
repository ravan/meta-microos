SUMMARY = "VIM plugin for for stgit"
DESCRIPTION = "VIM command line completion support for stgit."
LICENSE = "GPL-2.0-only"

PV = "2.6.1"

RPM_NAME = "stgit-vim-plugin-2.6.1-3.3.noarch.rpm"
RPM_HASH = "5a00c4a9f3b1db360a0bcc983657570b6e5a139f85f9b8540e43c2a0a95e87640a2dd6b5b7e893f5b4bb0cbb56f1981504ac843b302696a6e212d64a2d4cd94a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stgit-vim-plugin"

RDEPENDS:${PN} += "stgit \
vim"

inherit rpm
