SUMMARY = "Easy insert mode completion with Tab key"
DESCRIPTION = "This script allows you to use the tab key to do all your insert completion."
LICENSE = "BSD-3-Clause"

PV = "2.1"

RPM_NAME = "vim-plugin-supertab-2.1-64.2.noarch.rpm"
RPM_HASH = "d735d44a495291bc97fb2daffe6ca962c503896be74c53c9b278e76b9876391cad3b1706b68a9e4255ef29c8ef7971ab4fd223a00f4ac4a8e1139018e14ea796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-supertab"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
