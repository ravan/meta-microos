SUMMARY = "Script to link/unlink files to libreoffice home"
DESCRIPTION = "Script that links and unlinks files from /usr/share to libreoffice \
home as libreoffice layout is not set up for noarch packages otherwise."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "libreoffice-share-linker-1-7.9.noarch.rpm"
RPM_HASH = "fcb88842943cbbac87badf6167231352a7d958adf2066a8cc2a36dff252587c39d91909f5024db2af48d8af7cb5a972e6d4981ac763cb6f48ec5081e101465b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-share-linker"

RDEPENDS:${PN} += "/usr/bin/env \
python3"

inherit rpm
