SUMMARY = "Common Data files for vim & gvim"
DESCRIPTION = "This package contains basic runtime & syntax files for vim"
LICENSE = "Vim"

PV = "9.2.0901"

RPM_NAME = "vim-data-common-9.2.0901-1.1.noarch.rpm"
RPM_HASH = "3fdfd7a14787a02edaf4f161acddb9704368bdbac2ec42d98008f68368615854ab3e57cc9150e2cef6836e2bde4c14bd7a60a51ba9fb4d9524d86acc5e4f2a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-data-common"

RDEPENDS:${PN} += ""

inherit rpm
