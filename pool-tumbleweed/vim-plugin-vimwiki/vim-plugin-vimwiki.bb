SUMMARY = "Personal wiki for vim"
DESCRIPTION = "Vimwiki is a personal wiki for Vim. Using it you can organize text files with \
hyperlinks. To do a quick start press <Leader>ww (this is usually \\ww) to go \
to your index wiki file. By default it is located in ~/vimwiki/index.wiki. \
You do not have to create it manually - vimwiki can make it for you."
LICENSE = "GPL-2.0-only"

PV = "2.1"

RPM_NAME = "vim-plugin-vimwiki-2.1-64.2.noarch.rpm"
RPM_HASH = "1c12f76db1bfb42f4646d623030109a7a09fe3ea9c8389858281495745704c8328a504cd3e0892d66d9cf6e4a1db41cc0be7767292ec79cff4b0f13f7238b5e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-vimwiki"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
