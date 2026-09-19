SUMMARY = "Salt plugin for Vim"
DESCRIPTION = "This Vim plugin provides support for editing Saltstack .sls files."
LICENSE = "Apache-2.0"

PV = "20170630"

RPM_NAME = "vim-plugin-salt-20170630-64.2.noarch.rpm"
RPM_HASH = "b054a1fd5ada5480c715a1553f263bfd72ece7adee195391aedf3c46e0d30049e2a1a0bffd4b5cbb17daeebbbbfb71dd5b86e485adb00a1d582526c13f671bd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-salt"

RDEPENDS:${PN} += ""

inherit rpm
