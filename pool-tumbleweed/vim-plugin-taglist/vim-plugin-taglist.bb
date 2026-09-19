SUMMARY = "Source code browser with support for many languages"
DESCRIPTION = "The 'Tag List' plugin is a source code browser plugin for Vim and provides an \
overview of the structure of source code files and allows you to efficiently \
browse through source code files for different programming languages."
LICENSE = "ISC"

PV = "4.6"

RPM_NAME = "vim-plugin-taglist-4.6-64.2.noarch.rpm"
RPM_HASH = "c48f3f0a716b5d035e5398587fa985886a0fdc22181550b97a2f8ba229dc056537a612fcfddc6fd1b2fb8de31f1d64fa2a3930d0dac205064c512af75743ec97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-taglist"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
