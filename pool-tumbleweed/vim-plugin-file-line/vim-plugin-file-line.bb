SUMMARY = "File-line plugin for Vim"
DESCRIPTION = "Plugin for vim to enable opening a file in a given line."
LICENSE = "GPL-3.0-only"

PV = "1.0+20161020"

RPM_NAME = "vim-plugin-file-line-1.0+20161020-64.2.noarch.rpm"
RPM_HASH = "66237eb939e7feb71e7a1f273351be6c4ce280264b56c3c1c822a0ecf5fa1e0c25df7221e4f240105ab2989447ba2889f7cc68c48c46b2d39d7fbf90f156d528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-file-line"

RDEPENDS:${PN} += ""

inherit rpm
